package by.alextech303;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "PrintNameServletV2", urlPatterns = "/printV2")
public class PrintNameServletV2 {

    private String NAME_PARAMETR = "firstName";

    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        String [] names = request.getParameterMap().get(NAME_PARAMETR);

        if(names!=null){
            for(String name : names){
                printWriter.write("<p>" + NAME_PARAMETR  + ": "+ name + "</p>");
            }
        }
    }
}
