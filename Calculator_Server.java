import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/calculator_server"})
public class calculator_server extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
        try{
           
            int i=Integer.parseInt(request.getParameter("n1"));
            int j=Integer.parseInt(request.getParameter("n2"));
            int k=i+j;
            out.println("Addition="+k);
        }catch(Exception e1){
        	out.println("Exception : "+e1);
        	}
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}