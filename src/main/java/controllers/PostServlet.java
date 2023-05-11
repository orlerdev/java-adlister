package controllers;
import dao.Posts;
import dao.PostsDaoFactory;
import models.Post;
import models.UserPosts;
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
    String body = req.getParameter("post");
    Post post = new Post(title, body, UserPosts.randomUser());
    Posts postsDao = PostsDaoFactory.getPostsDao();
    postsDao.insert(post);
    res.sendRedirect("/posts");
  }
}


