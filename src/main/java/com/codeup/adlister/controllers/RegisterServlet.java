package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
  private Connection connection;


  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (request.getSession().getAttribute("user") != null) {
      response.sendRedirect("/profile");
      return;
    }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO: ensure the submitted information is valid
    // TODO: create a new user based off of the submitted information
    // TODO: if a user was successfully created, send them to their profile
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    boolean validEntries = !username.isBlank() && !email.isBlank() && !password.isBlank();

    if (validEntries) {
      User user = new User(username, email, password);
      DaoFactory.getUsersDao().insert(user);
      response.sendRedirect("/profile");
    }
  }
}
