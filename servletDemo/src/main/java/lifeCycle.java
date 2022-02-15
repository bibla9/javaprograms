import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class lifeCycle
 */
@WebServlet("/lifeCycle")
public class lifeCycle extends GenericServlet {
//	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		System.out.println("from service");
		PrintWriter pw = response.getWriter();
		pw.println("hey there");
		pw.println("forgiveness");
		
		
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
