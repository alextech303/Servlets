package by.alextech303;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


@WebServlet(name = "PrintServlet",urlPatterns = "/print")
public class PrintServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        Enumeration<String> params = request.getParameterNames();

        while (params.hasMoreElements()){
            String paramName = params.nextElement();
            printWriter.write("<p>" + paramName + ":" +request.getParameter(paramName)+ "</p>" );
        }
    }
}
