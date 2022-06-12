package by.alextech303;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PrintNameServletV3" , urlPatterns = "/printV3")
public class PrintNameServletV3 extends HttpServlet {
    private String NAME_PARAMETER_HEADER =  "ARRAY_NAME_PARAM";

    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {


        PrintWriter printWriter = response.getWriter();

        String header = request.getHeader(NAME_PARAMETER_HEADER);

        String[] names = request.getParameterMap().get(header);

        if (names != null) {
            for (String name : names) {
                printWriter.write("<p>" + header + ": " + name + "</p>" +"\n");
            }


        }

    }
}
