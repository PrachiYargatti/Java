package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOP {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "manager";
		
		System.out.println("update password - ");
		
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "UPDATE user SET password = ? WHERE email = ?";
			try (PreparedStatement updateStatement = connection.prepareStatement(sql)) {
				try (Scanner sc = new Scanner (System.in)){
					System.out.print("Enter the email id to update password - ");
					String email = sc.next();
					
					System.out.print("Enter new password - ");
					String password = sc.next();
					
					updateStatement.setString(1, password);
					updateStatement.setString(2 ,email);
					
					updateStatement.executeUpdate();
					System.out.println("password updated successfully...");
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
