package jdbcprograms;
import java.sql.*;
public class update {
	public static void main(String [] args) throws Exception{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
			System.out.println("Connection created successfully....");
			String sql = "UPDATE student SET smobileno=99999999 WHERE sid = 103";
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("data updated successfully");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
	}
}
