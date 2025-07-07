package com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string: ");
		String str = sc.nextLine();
		
		String reversed = "";
		
		//String reversed = new StringBuilder(str).reverse().toString();
		for (int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		
		System.out.println("reversed string: "+reversed);
		sc.close();
	}

}
