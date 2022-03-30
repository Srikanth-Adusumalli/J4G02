package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/learnjob", "root", "biki");
			Statement st = con.createStatement();
			
			
		
			ResultSet rs1 = st.executeQuery("Select ProductName from products where ProductCatagory= 'garments' ");
		     
			
			
			
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
