package dao;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.List;

public class AuthorsDao implements Authors {
  private static String password = "codeup";
  private Connection connection;

  public AuthorsDao() {
    try {
      DriverManager.registerDriver(new Driver());
      //MAKES THE CONNECTION TO THE DATABASE
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_design?allowPublicKeyRetrieval=true&useSSL=false",
              "root",
              password);
    } catch (SQLException sqlx) {
      throw new RuntimeException("Error connecting to the db", sqlx);
    }
  }

  @Override
  public List<Authors> all() {
    models.Authors authors = new models.Authors();
    try {
      //STATEMENT OBJECT NEEDED TO SEND QUERIES TO THE DATABASE
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM db_design.authors");
      while (resultSet.next()) {
        authors   ````````````````.add(resultSet.getString("first_name"));
      }
    } catch (SQLException sqlx) {
      throw new RuntimeException("Error connecting to db.");
    }
  }

  @Override
  public void insert(models.Authors authors) {

  }
}
