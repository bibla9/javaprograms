package jdbcprograms;
import java.sql.*;

public class jdbcConnection {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "";
		String query = "select * from student";
//		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connecting to the database");
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("creating statement");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt("sid");
			String sname = rs.getString("sname");
			int smobile = rs.getInt("smobileno");
			System.out.println("student id:- "+id);
			System.out.println("student name:- "+sname);
			System.out.println("student mobile:- "+smobile);
			
		}
		st.close();
		con.close();
	}
}
