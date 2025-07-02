package com.app.geometry;

public class Point2D{
	
	private double x;
	private double y;
	
	public Point2D() {
		//todo
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean isEqual(Point2D other) {
		return this.x == other.x && this.y == other.y;
	}
	
	public double calculateDistance(Point2D other) { //java.lang.Math class methods --sqrt, pow
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
}

package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int menulist() {
		int choice;
		System.out.println("\n--- Menu ---");
		System.out.println("0.Display details of a specific point");
		System.out.println("1.Display x, y co-ordinates of all points");
		System.out.println("2.User i/p : 2 indices for the points , validate the indices");
		System.out.println("3.exit");
		System.out.print("enter the choice: ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {

		System.out.print("Enter how many no of points to plot: ");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		for(int i=0; i<points.length; i++) {
			System.out.print("Enter x and y for point " + i + ": ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			points[i] = new Point2D(x, y);
		}
		
		boolean exit = false;
		while(!exit) {
			int choice = menulist();
			switch(choice) {
			case 0:
				System.out.println("\nDetails of a specific point: ");
				System.out.print("enter index: ");
				int index = sc.nextInt();
				if (index >= 0 && index < points.length) {
					System.out.println("Point: " + points[index].getDetails());
				}
				else {
					System.out.println("Invalid index.");
				}
				break;
				
			case 1:
				System.out.println("\nx, y co-ordinates of all points");
                for (Point2D p : points) {
                    System.out.println(p.getDetails());
                }
                break;
                
			case 2:
				System.out.println("\nUser i/p : 2 indices for the points , validate the indices");
				System.out.print("Enter index of start index: ");
				int i1 = sc.nextInt();
				System.out.print("Enter index of end index: ");
				int i2 = sc.nextInt();
				
				if(i1 >= 0 && i1 < points.length && i2 >=0 && i2 < points.length) {
					if(!points[i1].isEqual(points[i2])) {
						double dist = points[i1].calculateDistance(points[i2]);
						System.out.println("Distance: " + dist);
					}
					else {
						System.out.println("Points are at the same location!");
					}
				}
				else {
					System.out.println("Invalid indices.");
				}
				break;
				
			case 3:
				System.out.println("\nExited.");
				exit = true;
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}

}
