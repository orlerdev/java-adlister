import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("/login.jsp").forward(request, response);
    HttpSession session = request.getSession();
    boolean isLoggedIn = session.getAttribute("username") != null;
    if (isLoggedIn) {
      response.sendRedirect("/profile");
      return;
    }
    String language = (String) session.getAttribute("language");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    HttpSession session = request.getSession();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean validAttempt = username.equals("admin") && password.equals("password");

    if (validAttempt) {
      session.setAttribute("username", username);
      response.sendRedirect("/profile");
    } else {
      response.sendRedirect("/login");
    }
  }
}
