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

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter coordinates for Point 1 (x, y): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		Point2D p1 = new Point2D(x1, y1);
		
		System.out.print("enter coordinates for Point 2 (x, y): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2, y2);
		
		System.out.println("Point 1: " + p1.getDetails());
		System.out.println("Point 2: " + p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Points are the same.");
		}
		else {
			System.out.println("Points are different.");
			System.out.printf("Distance between points: %.2f", p1.calculateDistance(p2));
		}
		
		sc.close();
	}

}
