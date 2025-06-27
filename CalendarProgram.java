import java.util.Calendar;
import java.util.Scanner;

class Date{ // concrete class 
	private int day; 
	private int month; 
	private int year; 
	
	//paramter-less ctor 
	public Date( ) {
	   System.out.println("Date() ");
	   Calendar c = Calendar.getInstance(); 
	   day = c.get(Calendar.DATE); 
	   month = c.get(Calendar.MONTH) + 1; 
	   year = c.get(Calendar.YEAR); 
	}
	//paramterized ctor 
	public Date(int day , int month , int year) {
		System.out.println("public Date(int day , int month , int year)");
		this.day = day; 
		this.month = month; 
		this.year = year; 
	}
	public void acceptRecord( ) {
		Scanner sc  = new Scanner(System.in); 
		System.out.print("Day : ");
		day = sc.nextInt(); 
		System.out.print("Month : ");
		month = sc.nextInt(); 
		System.out.print("Year : ");
		year = sc.nextInt(); 
	}
	//this = dt2 
	public void printRecord( ) {
		System.out.println("Day : "+this.day);
		System.out.println("Month : "+this.month);
		System.out.println("Year : "+this.year);
	}
}

public class CalendarProgram {

	public static void main(String[] args) {
		Date dt1 = new Date(); // on d1 paramterless ctor will get called   
		dt1.printRecord();
		
		Date dt2 = new Date(1, 1, 2000); 
		// on dt2 paramterized ctor will get called 
		dt2.printRecord();// dt2.printRecord(dt2);
		 
	}

}
