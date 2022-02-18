package jdbcprograms;
import java.sql.*;
public class delete {
	public static void main(String [] args) throws Exception{
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
		System.out.println("connection created successfully");
		String sql = "DELETE FROM student WHERE sid = 103";
		System.out.println("creating statement");
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.print("data deleted sucessfully");
	}
	catch(SQLException e) {
		System.out.println(e);
	}
		
	}
}
