package com;

public class FindDuplicate {
	
	public static void main(String[] args) {
		String[] arr1 = {"India", "USA", "Iran", "Germany", "America"};
		
		String[] arr2 = {"Iraq", "India", "France", "America", "Germany"};
		
		String duplicates = "";
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if(arr1[i].equals(arr2[j])) {
					duplicates += arr1[i] +" "; 
				}
			}
		}
		
		System.out.println("duplicates : "+duplicates);
	}
}
