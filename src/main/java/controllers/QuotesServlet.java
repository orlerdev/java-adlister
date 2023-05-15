package controllers;
import dao.Quotes;
import dao.QuotesDao;
import models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/quotes")
public class QuotesServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    Quotes quotesDao = new QuotesDao();
    List<Quote> quotes = quotesDao.all();

    req.setAttribute("quotes", quotes);
    req.getRequestDispatcher("quotes.jsp").forward(req, res);
  }
}
