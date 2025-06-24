package day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		
		System.out.println(first);
		System.out.println(second);
		
		for (int i=0; i<10; i++) {
			int nxtNumber = first + second;
			System.out.println(nxtNumber);
			first = second;
			second = nxtNumber;
		}
	}

}
