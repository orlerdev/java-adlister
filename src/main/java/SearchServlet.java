import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class SearchServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String searchTerm = req.getParameter("search");
    res.setContentType("text/html");
    res.getWriter().printf("""
            <p>%s</p>
            """, searchTerm);
  };
};
