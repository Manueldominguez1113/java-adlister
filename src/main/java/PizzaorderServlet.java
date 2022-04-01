import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PizzaorderServlet",urlPatterns = "/pizza-order")
public class PizzaorderServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String crust = request.getParameter("crust");
    String sauce = request.getParameter("sauce");
    String size = request.getParameter("size");
    // if the name is null, it means that "name" was not present in the query
    // string, and here we'll provide a default value
    if (crust == null || sauce == null|| size == null) {
        response.sendRedirect("pizzaorder.jsp");
        return;
    }

    // pass the value of the name variable to the view, and send the request
    // forward to the hello.jsp file
    System.out.println("One "+size + " " +crust+" pizza with "+sauce+", coming up!");
    request.getRequestDispatcher("/pizzaorder.jsp").forward(request, response);
}



}
