package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
  private Connection connection;

  public MySQLUsersDao(Config config) {
    try {
      DriverManager.registerDriver(new Driver());
      connection = DriverManager.getConnection(
              config.getUrl(),
              config.getUser(),
              config.getPassword()
      );
    } catch (SQLException e) {
      throw new RuntimeException("Error connecting the database", e);
    }
  }

  @Override
  public User findByUsername(String username) {
    String findQuery = "select * from users where username = ? limit 1";
    try {
      PreparedStatement stmt = connection.prepareStatement(findQuery);
      stmt.setString(1, username);
      return fetchUser(stmt.executeQuery());
    } catch (SQLException e) {
      throw new RuntimeException("Error finding user", e);
    }
  }

  private User fetchUser(ResultSet rs) throws SQLException {

    if (! rs.next()) {
      return null;
    }
    return new User(
            rs.getLong("id"),
            rs.getString("username"),
            rs.getString("email"),
            rs.getString("password")
    );
  }

  @Override
  public Long insert(User user) {
    String query = "INSERT INTO users(username, email, password) VALUES (?,?,?)";
    try {
      PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
      stmt.setString(1, user.getUsername());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getPassword());
      stmt.executeUpdate();
      ResultSet rs = stmt.getGeneratedKeys();
      return rs.getLong(1);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
