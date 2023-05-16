package dao;
import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
  private Connection connection;

  public MySQLAdsDao() {
    try {
      DriverManager.registerDriver(new Driver());
      connection = DriverManager.getConnection(
              Config.getUrl(),
              Config.getUser(),
              Config.getPassword()
      );
    } catch (SQLException e) {
      throw new RuntimeException("Error connecting", e);
    }
  }

  @Override
  public List<Ad> all() {
    List<Ad> ads = new ArrayList<>();
    try {
      Statement statement = connection.createStatement();
      ResultSet rs = statement.executeQuery("SELECT * FROM ads");
      while (rs.next()) {
        ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                )
        );
      }
    } catch (SQLException e) {
      throw new RuntimeException("Error connecting", e);
    }
    return ads;
  }

//  @Override
//  public Long insert(Ad ad) {
//    try {
//      Statement statement = connection.createStatement();
//      statement.executeUpdate("insert into ads (user_id, title, description) values (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')", Statement.RETURN_GENERATED_KEYS);
//      ResultSet rs = statement.getGeneratedKeys();
//      if (rs.next()) {
//        return rs.getLong(1);
//      }
//    } catch (SQLException e) {
//      System.out.println("SQL Exception:" + e);
//    }
//    return null;
//  }


//  @Override
//  public Long insert(Ad ad) {
//    String query = "INSERT INTO adlister_db.ads(user_id, title, description) VALUES (?,?,?) ";
//    try {
//      PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//      ps.setLong(1, ad.getUserId());
//      ps.setString(2, ad.getTitle());
//      ps.setString(3, ad.getDescription());
//      ps.executeUpdate();
//      ResultSet rs = ps.getGeneratedKeys();
//      if (rs.next()) {
//        return rs.getLong(1);
//      }
//    } catch (SQLException e) {
//      throw new RuntimeException("Error connecting", e);
//    }
//    return null;
//  }

  @Override
  public Long insert(Ad ad) {
    String query = "INSERT INTO ads(user_id, title, description) VALUES (?,?,?)";
    try {
      PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
      stmt.setLong(1, ad.getUserId());
      stmt.setString(2, ad.getTitle());
      stmt.setString(3, ad.getDescription());
      stmt.executeUpdate();
      ResultSet rs = stmt.getGeneratedKeys();
      return rs.getLong(1);
    } catch (SQLException e) {
      throw new RuntimeException("Error creating new ad.", e);
    }
  }

  private String createInsertQuery(Ad ad) {
    String query = "insert into ads(user_id, title, description) values (?,?,?)";
    return "insert into ads(user_id, title, description) values (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')";
  }

  private Ad extractAd(ResultSet rs) throws SQLException {
    return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
    );
  }
}