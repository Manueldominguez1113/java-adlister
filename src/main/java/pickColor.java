import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pickColor", urlPatterns = "/pickColor")
public class pickColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pickColor.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameter("color"));
    }
}
