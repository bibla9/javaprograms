package jdbcprograms;
import java.sql.*;
public class insert {
	public static void main(String [] args) throws Exception{
		try {
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String uname = "root";
			String pass = "";
			System.out.println("Connecting to the db.......");
			Connection con = DriverManager.getConnection(url,uname,pass);
			String sql = "insert into student values(103,'shaikh',846992949)";
			System.out.println("Creating a statement");
			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(query);
//			---------------the executeUpdate function is for DML commands means to insert, update, delete the rows -----------------
			st.executeUpdate(sql);
			System.out.println("data inserted successfully");
		}
		catch (SQLException e){
			System.out.println(e);
		}
		
	}
}
