package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertOP {

	public static void main(String[] args) {
		
		try {
			// load and register the Driver class towards JVM
			// This is an optional step from JDBC 4 spec onwards
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "manager";

		System.out.println("REGISTRATION - ");

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "INSERT INTO user(name,email,password,city) VALUES(?,?,?,?)";
			// String sql = "UPDATE user SET password = ? WHERE email = ?";
			// String sql = "DELETE FROM user WHERE uid = ?";
			try (PreparedStatement insertStatement = connection.prepareStatement(sql)) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter the user name - ");
					String name = sc.next();
					System.out.print("Enter the email - ");
					String email = sc.next();
					System.out.print("Enter the password - ");
					String password = sc.next();
					System.out.print("Enter the city - ");
					String city = sc.next();

					insertStatement.setString(1, name);
					insertStatement.setString(2, email);
					insertStatement.setString(3, password);
					insertStatement.setString(4, city);

					insertStatement.executeUpdate();
					System.out.println("Registration is successful...");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
