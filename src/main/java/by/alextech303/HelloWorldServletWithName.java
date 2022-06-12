package by.alextech303;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldWithNameServlet", urlPatterns = "/hello_with_name")
public class HelloWorldServletWithName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>Hello, " + firstName + " " + lastName + "!</span></p>");
    }
}

