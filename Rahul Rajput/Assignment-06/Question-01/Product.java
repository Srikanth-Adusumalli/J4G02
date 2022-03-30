package com.Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Product {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul", "root", "root");
			PreparedStatement preparedStatement2 = connection.prepareStatement("select * from product");

			ResultSet resultSet = preparedStatement2.executeQuery();
			while (resultSet.next()) {
				// System.out.print(resultSet.getInt(1),
				// resultSet.getString(2),resultSet.getDouble(3),resultSet.getString(4));
				System.out.println("Product Id - " + resultSet.getInt(1) +  "\t"  + "Product Name - "
						+ resultSet.getString(2) +  " \t "  + " Product Price - " + resultSet.getInt(3) + "\t" 
						+ " Product Category - " + resultSet.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
