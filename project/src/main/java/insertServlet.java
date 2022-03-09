

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = "avesh";
		String email = "bibla@gmail.com";
		String pass = "avesh";
		String mobile = "989898";
		PrintWriter pw = response.getWriter();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/plants","root","");
			String sql = "insert into user_table (user_name,user_email,user_password,user_mobile) values("+uname+","+email+","+pass+","+mobile+")";
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql);
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
