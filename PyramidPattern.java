
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int i=0; i<n; i++) {
			System.out.print(" ".repeat(n-i-1));
			System.out.println("* ".repeat(i+1));
		}
	}

}
