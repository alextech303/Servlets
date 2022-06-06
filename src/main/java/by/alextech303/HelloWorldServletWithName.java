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
@WebServlet(name = "HelloWorldServletWithName", urlPatterns = "/hello_with_name")
public class HelloWorldServletWithName extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");

    PrintWriter printWriter = response.getWriter();
    printWriter.write("<p><span style='color: blue;'>Hello,  "+ firstName+ " "+ lastName+"!</span></p>");



  }

}
