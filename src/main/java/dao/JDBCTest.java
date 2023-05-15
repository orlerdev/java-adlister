package dao;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

  public static void main(String[] args) {
    for (String name : getAuthorNames()) {
      System.out.println(name);
    }
  }

  private static List<String> getAuthorNames() {
    List<String> authorNames = new ArrayList<>();
    try {
      //USED TO CONNECT TO THE DATABASE
      DriverManager.registerDriver(new Driver());
      //MAKES THE CONNECTION TO THE DATABASE
      Connection connection = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
              "root",
              "codeup"
      );
      //STATEMENT OBJECT NEEDED TO SEND QUERIES TO THE DATABASE
      Statement statement = connection.createStatement();

      ResultSet resultSet = statement.executeQuery("SELECT name FROM authors");
      while (resultSet.next()) {
        authorNames.add(resultSet.getString("name"));
      }
    } catch (SQLException sqlx) {
      sqlx.printStackTrace();
    }
    return authorNames;
  }
}
