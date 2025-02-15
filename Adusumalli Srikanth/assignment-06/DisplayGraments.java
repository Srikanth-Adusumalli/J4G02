//ass06- Que02;

package assignment06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DisplayGraments {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver is loaded");
	
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjobs", "root","ask12345");
			System.out.println("Connection established");
			String garmentProduct="SELECT * from product WHERE category= ?";
			PreparedStatement statement = connection.prepareStatement(garmentProduct);	
			statement.setString(1, "garments");
			ResultSet rs=statement.executeQuery();
			System.out.println("ID    NAME    PRICE    CATEGORY");
			while(rs.next())
					System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getFloat(3)+"   "+rs.getString(4));
			}
		catch (ClassNotFoundException e) {
				System.err.println("Driver not configured");
		}
		catch (SQLException e) {
				System.err.println("Connection not established");
		}
	}
}

