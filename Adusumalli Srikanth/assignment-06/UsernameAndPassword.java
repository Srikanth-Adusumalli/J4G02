//ass06- Que03;

package assignment06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");		
				System.out.println("Driver is loaded");
	
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjobs", "root","ask12345");
				System.out.println("Connection established");
			
				Scanner scan=new Scanner(System.in);
				System.out.print("Input username : ");
				String userName=scan.nextLine();
				System.out.print("Input password : ");
				String passWord=scan.nextLine();
			
				String userQuery="SELECT username,password from user WHERE username=? AND password=?";
			
				PreparedStatement statement = connection.prepareStatement(userQuery);
				statement.setString(1, userName);
				statement.setString(2, passWord); 
				ResultSet rs=statement.executeQuery();
				if(rs.next()==false)
					System.out.println("Invalid Login Credentials");
				else
					System.out.println("Login Successfully");
			}
		catch (ClassNotFoundException e) {
				System.err.println("Driver not configured");
		}
		catch (SQLException e) {
				System.err.println("You are not Registered user");
		}
	}
}
