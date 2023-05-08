import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String username = req.getParameter("username");
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    if (username != null){
      out.printf("<h1>Hello, %s!</h1>", username);
    } else {
      out.println("<h1>Hello, World!</h1>");
    }
  }
}
