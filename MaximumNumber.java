package day1;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);	
	    System.out.print("Enter three numbers: ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    
	    if(a>=b) {
	    	if(a>=c) {
	    		System.out.println(a + " is maximum");
	    	}
	    	else {
	    		System.out.println(c + " is maximum");
	    	}
	    }
	    else{
	    	if(b>=c) {
	    		System.out.println(b + " is maximum");
	    	}
	    	else {
	    		System.out.println(c + " is maximum");
	    	}
	    }
	}

}

//Enter three numbers: 5 0 9
//9 is maximum
