package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOP {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "manager";
		
		System.out.println("Delete user - ");
		
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "DELETE FROM user WHERE uid = ?";
			try (PreparedStatement deleteStatement = connection.prepareStatement(sql)) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("enter the user id to delete - ");
					int uid = sc.nextInt();
					
					deleteStatement.setInt(1, uid);
					deleteStatement.executeUpdate();
					
					System.out.println("user deleted...");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
