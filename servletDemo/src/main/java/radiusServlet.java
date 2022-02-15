
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.net.*;
import java.io.*;
/**
 * Servlet implementation class radiusServlet
 */
@WebServlet("/radiusServlet")
public class radiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public radiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String radius = request.getParameter("radius_txt");
		int r = Integer.parseInt(radius);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Finding area of circle</title>");
		out.println("</head>");
		out.println("<body>");
		double a = 3.14 * r * r;
		out.println("The area of circle is:- "+a);
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
