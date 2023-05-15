package dao;
import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes {
  private Connection connection;

  public QuotesDao() {
    try {
      DriverManager.registerDriver(new Driver());
      connection = DriverManager.getConnection(Config.getUrl(), Config.getUser(), Config.getPassword());
    } catch (SQLException sqle) {
      throw new RuntimeException("Error connecting to db", sqle);
    }
  }

  @Override
  public List<Quote> all() {
    Authors authorsDao = new AuthorDao();
    List<Author> authors = authorsDao.all();
    List<Quote> quotes = new ArrayList<>();
    try {
      Statement statement = connection.createStatement();
      ResultSet rs = statement.executeQuery("SELECT * FROM quotes");
      while (rs.next()) {
        int author_id = rs.getInt("author_id");
        Author quoteAuthor = null;
        for (Author author : authors) {
          if (author.getId() == author_id) {
            quoteAuthor = author;
          }
        }
        Quote quote = new Quote(
                rs.getLong("id"),
                rs.getString("content"),
                quoteAuthor
        );
        quotes.add(quote);
      }
    } catch (SQLException sqle) {
      throw new RuntimeException("error connecting to db", sqle);
    }
    return quotes;
  }

  @Override
  public void insert(Quote quote) {

  }
}
