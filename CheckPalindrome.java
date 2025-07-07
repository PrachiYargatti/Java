package com;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string: ");
		String str = sc.nextLine();
		
		String reversed = "";
		
		//String reversed = new StringBuilder(str).reverse().toString();
		for (int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("reversed string of " + str + " : " + reversed);
		
		System.out.println();
		if(reversed.equals(str)) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
		sc.close();

	}
}
