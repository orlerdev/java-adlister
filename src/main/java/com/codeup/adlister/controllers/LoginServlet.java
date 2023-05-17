package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
  private Connection connection;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (request.getSession().getAttribute("user") != null) {
      response.sendRedirect("/profile");
      return;
    }
    request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User user = DaoFactory.getUsersDao().findByUsername(username);
    // TODO: find a record in your database that matches the submitted password
    // TODO: make sure we find a user with that username
    // TODO: check the submitted password against what you have in your database

    if (validAttempt(username, password, user)) {
      request.getSession().setAttribute("user", user);
      response.sendRedirect("/profile");
    } else {
      response.sendRedirect("/login");
    }
    // TODO: store the logged in user object in the session, instead of just the username
  }

  public static boolean validAttempt(String username, String password, User user) {
    if (user == null) {
      return false;
    }
    if (user.getPassword().equals(password)) {
      return true;
    }
    return false;
  }
}

//    String searchQuery = "SELECT * FROM users WHERE username = (?) && password = (?)";
//    String searchQuery = "SELECT * FROM users WHERE username = ? && password = ? ";
//
//    try {
//      PreparedStatement stmt = connection.prepareStatement(searchQuery);
//      stmt.setString(1, username);
//      stmt.setString(2, password);
//      stmt.executeQuery();
//      ResultSet rs = stmt.getResultSet();
//      user = new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
//    } catch (SQLException e) {
//      throw new RuntimeException("User not found", e);
//    }
//
//    if (password.equals(user.getPassword())) {
//      validAttempt = true;
//    }
//
//    if (validAttempt) {
//      request.getSession().setAttribute("user", username);
//      response.sendRedirect("/profile");
//    } else {
//      response.sendRedirect("/login");
//    }