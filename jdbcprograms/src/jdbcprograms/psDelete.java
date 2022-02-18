package jdbcprograms;
import java.sql.*;
public class psDelete {
	public static void main(String [] args) throws Exception{
		try {
			int id = 106;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
			PreparedStatement ps = con.prepareStatement("delete from student where sid=?");
			ps.setInt(1,id);
			int result = ps.executeUpdate();
			if(result!=0) {
				System.out.println("data deleted successfully");
			}else {
				System.out.println("error in delete operation");
			}
			String sql = "select  * from student";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("fetching the table data...");
			while(rs.next()) {
				int std_id = rs.getInt("sid");
				String std_name = rs.getString("sname");
				int std_mobile = rs.getInt("smobileno");
				System.out.println("Student id:- "+std_id);
				System.out.println("Student name:- "+std_name);
				System.out.println("Student mobile:- "+std_mobile);
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
