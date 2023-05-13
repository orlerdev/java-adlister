package dao;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
  private static String password = "codeup";

  public static void main(String[] args) {
    for (String first_name : getAuthorNames()) {
      System.out.println(first_name);
    }
  }

  private static List<String> getAuthorNames() {
    List<String> authorNames = new ArrayList<>();
    try {
      //USED TO CONNECT TO THE DATABASE
      DriverManager.registerDriver(new Driver());
      //MAKES THE CONNECTION TO THE DATABASE
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_design?allowPublicKeyRetrieval=true&useSSL=false",
              "root",
              password);
      //STATEMENT OBJECT NEEDED TO SEND QUERIES TO THE DATABASE
      Statement statement = connection.createStatement();

      ResultSet resultSet = statement.executeQuery("SELECT first_name FROM db_design.authors");
      while (resultSet.next()) {
        authorNames.add(resultSet.getString("first_name"));
      }
    } catch (SQLException sqlx) {
      sqlx.printStackTrace();
    }
    return authorNames;
  }
}
