

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("cid");
		String uname = request.getParameter("fname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pwd");
		String mobile = request.getParameter("phone");
		int contact = Integer.parseInt(mobile);
		int cid = Integer.parseInt(id);
		PrintWriter pw = response.getWriter();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/plants","root","");
			PreparedStatement ps = con.prepareStatement("insert into Customer_table values(?,?,?,?,?)");
			ps.setInt(1,cid);
			ps.setString(2,uname);
			ps.setString(3,email);
			ps.setString(4,pass);
			ps.setInt(5,contact);
			int result = ps.executeUpdate();
			if(result != 0) {
				pw.println("Data inserted successfully");
			}
			else {
				pw.println("Error in inserting the data");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			pw.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
