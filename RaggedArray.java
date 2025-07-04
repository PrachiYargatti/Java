package com;

public class RaggedArray {

	public static void main(String[] args) {
		
		//int[][] arr1 = new int[3][3]; // memory allocated on heap ( default 0 )
		
		//int[] arr2[] = new int[3][3]; // memory allocated on heap ( default 0 )
				
		//int arr3[][] = new int[3][3]; // memory allocated on heap ( default 0 )

		double[][] arr4 = new double[][] {{1.1,2.1,3.1},{4.1,5.1,6.1}}; // 2 rows * 3 cols 
				 
		
		for(int i = 0 ; i < arr4.length ; i++) {
			for(int j = 0 ; j < arr4[i].length ; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] rarr = new int[4][];
		rarr[0] = new int[1];
		rarr[1] = new int[2];
		rarr[2] = new int[3];
		rarr[3] = new int[4]; 
		
		for(int i = 0 ; i < rarr.length ; i++) {
			 for(int j = 0 ; j < rarr[i].length ; j++) {
				 System.out.print(rarr[i][j] + " ");
			 }
			 System.out.println();
		}
		
		int num = 0; 
		for(int i = 0 ; i < rarr.length ; i++) {
			for(int j = 0 ; j < rarr[i].length ; j++) {
				rarr[i][j] = ++num; 
			}
		}
		
		for(int i = 0 ; i < rarr.length ; i++) {
			 for(int j = 0 ; j < rarr[i].length ; j++) {
				 System.out.print(rarr[i][j] + " ");
			 }
			 System.out.println();
		 }
		
	}

}
