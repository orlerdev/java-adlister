package controllers;
import models.Post;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createPost")
public class PostServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    RequestDispatcher view = req.getRequestDispatcher("/blog/createPost.jsp");
    view.forward(req, res);
  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String title = req.getParameter("title");
    String post = req.getParameter("post");
    Post submittedPost = new Post(title, post);
    System.out.println(post);
    req.setAttribute("post", submittedPost);
    req.getRequestDispatcher("/blog/createPost.jsp").forward(req, res);
  }
}


