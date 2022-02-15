

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class client
 */
@WebServlet("/client")
public class client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("Client's Browser: "+request.getHeader("user-agent"));
		out.print("<br/>Client's IP Address: "+request.getRemoteAddr());
		out.print("<br/>Client Port No: "+request.getRemotePort());
		out.print("<br/>Server Port No: "+request.getServerPort());
		out.print("<br/>Local Port No: "+request.getLocalPort());
		out.print("<br/>Method used by client: "+request.getMethod());
		out.print("<br/>QueryString: "+request.getQueryString());
		
	}

}
