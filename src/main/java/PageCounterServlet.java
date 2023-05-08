import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class PageCounterServlet extends HttpServlet {

  int pageViews = 0;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String count = req.getParameter("count");
    String reset = req.getParameter("reset");
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    pageViews++;
    out.printf("<h2>%d page views<h2>", pageViews);

    if (req.getParameter("reset").equalsIgnoreCase("reset")) {
      pageViews = 0;
    }
  }
}
