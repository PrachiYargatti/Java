package day1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				System.out.println("* ".repeat(n));
			}
			else {
				System.out.print("* ");
				System.out.print("  ".repeat(n-2));
				System.out.println("* ");
			}
		}
	}

}
//output =>
//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * * 
