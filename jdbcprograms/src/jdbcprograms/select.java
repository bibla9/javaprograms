package jdbcprograms;
import java.sql.*;
public class select {
	public static void main(String []args)throws Exception {
		try {
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
			System.out.println("Connected to the database.....");
			String sql = "select * from student";
			Statement st = con.createStatement();
			System.out.println("Statement created successfully");
			ResultSet rs = st.executeQuery(sql);
			System.out.println("fetching the data.............");
			while(rs.next()) {
				int sid = rs.getInt("sid");
				String sname = rs.getString("sname");
				int smobile = rs.getInt("smobileno");
				System.out.println("Student id:- "+ sid);
				System.out.println("Student name:- "+sname);
				System.out.println("Student mobileno:- "+smobile);
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
}
