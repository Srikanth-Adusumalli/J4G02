package jdbc.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class productlist
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/productdata", "root", "");
			Statement st = con.createStatement();
			
			
		ResultSet rs = st.executeQuery("Select * from products");
			ResultSet rs1 = st.executeQuery("Select * from productdata");
		     
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			while(rs1.next()) {
				System.out.println(rs1.getString(1));
			}

			
		} catch (ClassNotFoundException e) {
			System.err.println("Driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	
	}
}

