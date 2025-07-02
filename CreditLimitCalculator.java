package com;

import java.util.Scanner;

public class CreditLimitCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter beggining balance: ");
		int beginningBalance = sc.nextInt();
		
		System.out.print("Enter total charges: ");
		int charges = sc.nextInt();
		
		System.out.print("Enter total credits: ");
		int credits = sc.nextInt();
		
		System.out.print("Enter credit limit: ");
		int creditLimit = sc.nextInt();
		
		int newBalance = beginningBalance + charges - credits;
		
		System.out.println("\nAccount: " + accountNumber);
		System.out.println("New Balance = ₹" + newBalance);
		
		if(newBalance > creditLimit) {
			System.out.println("Credit limit exceeded.");
		}
		else {
			System.out.println("Credit limit not exceeded.");
		}
		
		sc.close();
	}
}
