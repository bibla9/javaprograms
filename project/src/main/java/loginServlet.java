

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =  response.getWriter();
		String email = request.getParameter("email");
		String pass = request.getParameter("pwd");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/plants","root","");
			String sql = "select * from Customer_table where Cemail ='"+email+"' and Cpassword ='"+pass+"'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String cemail = rs.getString("Cemail");
				String cpwd = rs.getString("Cpassword");
				if((email.equals(cemail)) && (pass.equals(cpwd))) {
					pw.println("welcome, "+ email);
				}
				else {
					pw.println("Invalid email or password");
				}	
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
