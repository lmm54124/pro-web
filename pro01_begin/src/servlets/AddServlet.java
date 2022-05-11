package servlets;


import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

public class AddServlet extends HttpServlet {
    @Override
     public void init(){
         ServletConfig servletConfig = getServletConfig();
         String initValue = servletConfig.getInitParameter("Hello");
         System.out.println(initValue);
     }
}
