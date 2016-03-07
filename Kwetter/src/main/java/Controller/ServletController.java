package Controller;

import Domain.KwetterUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by koenv on 7-3-2016.
 */
@WebServlet(name = "Kwetter", urlPatterns = {"/Index"})
public class ServletController extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        KwetterUser ku = new KwetterUser();
        req.getRequestDispatcher("Index.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        KwetterUser ku = new KwetterUser();
        req.getRequestDispatcher("Index.jsp").forward(req, resp);
    }
}
