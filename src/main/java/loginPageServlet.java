import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Parameter;

@WebServlet(name = "Products.loginPageServlet", urlPatterns = "/login")
public class loginPageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*request.setAttribute("title","hello this worked!1");
        request.getRequestDispatcher("partials/head.jsp").forward(request, response);
            this outputs html, therefore should stay on the jsp.   */
        request.getRequestDispatcher("/intro/login.jsp").forward(request,response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

            String username = request.getParameter("username");
        String password = request.getParameter("password");

            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("/intro/profile.jsp");

        }
    }
}


/*






    <jsp:include page="partials/navbar.jsp" />
*/
