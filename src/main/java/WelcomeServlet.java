import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String username = req.getParameter("username");
    String email = req.getParameter("email");
    res.setContentType("text/html");
    res.getWriter().printf("""
            <h2>Username: %s<h2>
            <p>Email: %s
            """, username, email);
  }
}