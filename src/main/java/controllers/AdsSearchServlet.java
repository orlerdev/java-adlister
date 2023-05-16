package controllers;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/search")
public class AdsSearchServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    req.getRequestDispatcher("/WEB-INF/ads/search.jsp").forward(req, res);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String search = req.getParameter("search");
    req.setAttribute("search", search);
    req.getRequestDispatcher("WEB-INF/ads/search.jsp").forward(req, res);
  }
}

