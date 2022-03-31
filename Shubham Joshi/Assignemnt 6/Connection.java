package jdbc.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//public static Connection getConnection() throws ClassNotFoundException,SQLException
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	
	
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/productlist\",\"root\",\"");
		System.out.println("Driver is loaded ");
	}

}
