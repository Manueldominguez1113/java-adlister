package controllers;

import Adverts.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.adServlet", urlPatterns = "/ads")
public class adServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adverts = DaoFactory.getAdsDao(); //call the factory
        List<Ad> ads = adverts.all(); //find or generate all adverts
        request.setAttribute("ads", ads); // should name the list of adverts to ads to send to website
        request.getRequestDispatcher("/ads/index.jsp").forward(request,response);

    }
// dont need a post yet, not dealing with the created ads.
}
