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

  @Override
  public Long insert(Ad ad) {
    try {
      Statement statement = connection.createStatement();
      statement.executeUpdate("insert into ads (user_id, title, description) values (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')", Statement.RETURN_GENERATED_KEYS);
      ResultSet rs = statement.getGeneratedKeys();
      if (rs.next()) {
        return rs.getLong(1);
      }
    } catch (SQLException e) {
      System.out.println("SQL Exception:" + e);
    }
    return null;
  }


//  @Override
//  public Long insert(Ad ad) {
//    try {
//      long id = ad.getId();
//      long user_id = ad.getUserId();
//      String title = ad.getTitle();
//      String description = ad.getDescription();
//
//      String query = "INSERT INTO adlister_db.ads(user_id, title, description) VALUES (?,?,?) ";
//      PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//      ps.setInt(1, (int) ad.getUserId());
//      ps.setString(2, ad.getTitle());
//      ps.setString(3, ad.getDescription());
//      ResultSet rs = ps.getGeneratedKeys();
//      if(rs.next()) {
//      return (long) ps.executeUpdate();
//    }
//    } catch (SQLException e) {
//      throw new RuntimeException("Error connecting", e);
//    }
//    return ad.getId();
//  }
}