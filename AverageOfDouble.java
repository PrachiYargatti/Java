import java.util.Scanner;

public class AverageOfDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first value: ");
		
		if(!sc.hasNextDouble()){
			System.out.println("Error: Given numbers are not double.");
		}
		else{
			double num1 = sc.nextDouble();
			
			System.out.print("enter second value: ");
		
			if(!sc.hasNextDouble()) {
				System.out.println("Error: Given numbers are not double.");
			}
			else{
				double num2 = sc.nextDouble();
				double avg = (num1 + num2) / 2;
				System.out.println("Average of both numbers are: "+ avg);
			}
		}
	}

}
