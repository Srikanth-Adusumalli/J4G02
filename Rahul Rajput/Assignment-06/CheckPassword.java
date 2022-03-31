package com.Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul", "root", "root");
			System.out.println("please enter your user name");
			String username = sc.nextLine();
			System.out.println("please enter your password");
			String password = sc.nextLine();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user ");
			ResultSet resultSet = preparedStatement.executeQuery();

			int flag = 0;
			boolean b = false;
			while (resultSet.next()) {

				if (username.equals(resultSet.getString(2))) {
					if (password.equals(resultSet.getString(3))) {
						flag++;
						b = true;
					}
				}
				if (b == true) {

					System.out.println("User Id" + " - " + resultSet.getInt(1) + "\t" + "User Name - " + " "
							+ resultSet.getString(2) + "\t" + "Password - " + resultSet.getString(3) + "\t"
							+ "User Age - " + resultSet.getInt(4));
					break;
				} else if (flag == 0) {
					System.out.println("User not Found!!");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
