//package dao;
//import com.mysql.cj.jdbc.Driver;
//import models.Author;
//import models.Quote;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuotesJoinDao implements Quotes {
//  private Connection connection;
//
//  public QuotesJoinDao() {
//    try {
//      DriverManager.registerDriver(new Driver());
//      connection = DriverManager.getConnection(
//              "jdbc:mysql://localhost:3306/codeup_test_db", "root", "codeup");
//    } catch (SQLException sqlx) {
//      throw new RuntimeException(sqlx);
//    }
//  }
//
//  @Override
//  public List<Quote> all() {
//    Authors authorsDao = new AuthorDao();
//    List<Author> authors = authorsDao.all();
//    List<Quote> quotes = new ArrayList<>();
//    try {
//      Statement statement = connection.createStatement();
//      ResultSet resultSet = statement.executeQuery("select * from codeup_test_db.quotes join quotes on authors.id = quotes.author");
//      while (resultSet.next()) {
//        int author_id = resultSet.getInt("author_id");
//        Author quoteAuthor = null;
//        for (Author author : authors) {
//          if (author.getId() == author_id) {
//            quoteAuthor = author;
//          }
//        }
//
//        Quote quote = new Quote(
//                resultSet.getLong("id"),
//                resultSet.getString("content"),
//                quoteAuthor
//        );
//      }
//    } catch (SQLException sqlx) {
//      throw new RuntimeException(sqlx);
//    }
//    return quotes;
//  }
//
//  @Override
//  public void insert(Quote quote) {
//
//  }
//}
