package jdbcprograms;
import java.sql.*;

public class connection {
	public static void main(String [] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "";
		String query = "select * from student";
		System.out.println("connecting to the db");
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("creating statement");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int sid = rs.getInt("sid");
			String sname = rs.getString("sname");
			int smobile = rs.getInt("smobileno");
			System.out.println("Student id is:- "+sid);
			System.out.println("Student name is:- "+sname);
			System.out.println("Student mobileno is:- "+smobile);
			
		}
		st.close();
		con.close();
	}
}
