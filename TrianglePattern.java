package day1;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int i=0; i<n; i++) {
			if(i==0) {
				System.out.print(" ".repeat(n-1));
				System.out.println("*");
			}
			else if(i==n-1) {
				System.out.print("* ".repeat(n));
			}
			else {
				System.out.print(" ".repeat(n-i-1));
				System.out.print("*");
				System.out.print(" ".repeat((2*i)-1));
				System.out.println("*");
			}
		}
	}

}

//output => *
//			   * *
//			  *   *
//			 *     *
//			* * * * * 
