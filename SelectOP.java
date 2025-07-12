package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectOP {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USER = "root";
		final String PASSWORD = "manager";

		System.out.println("login page - ");
		
		try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
			String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
			try(PreparedStatement selectStatement = connection.prepareStatement(sql)){
				try(Scanner sc = new Scanner (System.in)){
					System.out.println("enter email - ");
					String email = sc.next();
					
					System.out.println("enter password");
					String password = sc.next();
					
					selectStatement.setString(1, email);
					selectStatement.setString(2, password);
					
					ResultSet rs = selectStatement.executeQuery();
					if(rs.next()) {
						System.out.println("login successful");
						System.out.println("Hi - " + rs.getString(2));
					}
					else {
						System.out.println("Invalid Credentials...");
					}
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
