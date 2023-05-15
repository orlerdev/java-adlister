package controllers;
import dao.Authors;
import dao.AuthorDao;
import models.Author;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/authors")
public class AuthorServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Authors authorsDao = new AuthorDao();
    List<Author> authors = authorsDao.all();
    req.setAttribute("authors", authors);
    req.getRequestDispatcher("authors.jsp").forward(req, resp);
  }
}
