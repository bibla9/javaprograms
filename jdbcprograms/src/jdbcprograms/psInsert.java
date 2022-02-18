package jdbcprograms;
import java.sql.*;
public class psInsert {
	public static void main(String [] args) throws Exception{
		try {
			int sid = 109;
			String sname = "bibla shaikh";
			int smobile = 984297359;
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","");
			PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?)");
			ps.setInt(1, sid);
			ps.setString(2, sname);
			ps.setInt(3, smobile);
			int result = ps.executeUpdate();
			if(result!=0) {
				System.out.println("data inserted successfully");
			}
			else {
				System.out.println("error in inserting the data");
			}
			String sql = "select * from student";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("Fetching data from student table .......");
			while(rs.next()) {
				int std_id = rs.getInt("sid");
				String std_name = rs.getString("sname");
				int std_mobile = rs.getInt("smobileno");
				System.out.println("Student id:- "+std_id);
				System.out.println("Student name:- "+std_name);
				System.out.println("Student mobile:- "+std_mobile);
			}
			ps.close();
			con.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		}
}
