package jdbcprograms;
import java.sql.*;
public class addretrive {
	public static void main(String [] args) throws Exception{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
			String sql = "insert into student values (106,'pqr',978724154)";
			String sql2 = "select * from student";
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Data inserted successfully");
			ResultSet rs = st.executeQuery(sql2);
			while(rs.next()) {
				int sid = rs.getInt("sid");
				String sname = rs.getString("sname");
				int smobile = rs.getInt("smobileno");
				System.out.println("Student id :- "+sid);
				System.out.println("Student name :- "+sname);
				System.out.println("Student moblieno :- "+smobile);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
}
