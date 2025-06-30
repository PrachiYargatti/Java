package com.dkte;

import java.util.Calendar;
import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Date() {
		Calendar c = Calendar.getInstance();
		day = c.get(Calendar.DATE);
		month = c.get(Calendar.MONTH);
		year = c.get(Calendar.YEAR);
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
}

class DateTest{
	
	Date dt1 = new Date();
			
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("day: ");
		dt1.setDay(sc.nextInt());
		
		System.out.print("month: ");
		dt1.setMonth(sc.nextInt());
		
		System.out.print("year: ");
		dt1.setYear(sc.nextInt());
		
		sc.close();
	}
	
	public void printRecord() {
		System.out.printf("current date: %d/%d/%d",dt1.getDay(),dt1.getMonth(),dt1.getYear());
	}
}
public class DateProgram {

	public static void main(String[] args) {
		
		DateTest dt1 = new DateTest();
		dt1.printRecord();
		
		dt1.acceptRecord();
		dt1.printRecord();
		
	}

}
