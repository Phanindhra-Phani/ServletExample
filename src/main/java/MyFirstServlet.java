import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public void doGet(HttpServletRequest req, HttpServletResponse response)
		        throws ServletException, IOException
    {
//		 	response.setContentType("application/pdf");
		 	response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h1>This is my first Servlet</h1>");
			out.println("</body></html>");
			out.println("I have made a change to doget");
       
    }
	 
	 
	public void doPost(HttpServletRequest req, HttpServletResponse response)
		        throws ServletException, IOException
    {
//		 	response.setContentType("application/pdf");
		 	response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h1>This is my first Servlet</h1>");
			out.println("</body></html>");
       
    }
	 

}
