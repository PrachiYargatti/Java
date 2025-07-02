package com.app;

import java.util.Scanner;

public class DailyDrivingCostCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter total miles driven per day: ");
		double milesPerDay = sc.nextDouble();
		
		System.out.print("enter cost per gallon of gasoline: "); //gasoline also called petrol
		double costPerGallon = sc.nextDouble();
		
		System.out.print("enter average miles per gallon: ");
		double avgMilesPerGallon = sc.nextDouble();
		
		System.out.print("enter parking fees per day: ");
		double parkingFees = sc.nextDouble();
		
		System.out.print("enter tolls per day: ");
		double tolls = sc.nextDouble();
		
		//gallon = unit of volume (measure liquids like fuel, milk, water) (1 Gallon = 3.785 liters)
		//miles = unit of distance or length (1 miles = 1.609 Kilometers)
		double gallonsUsed = milesPerDay / avgMilesPerGallon;
		double fuelCost = gallonsUsed * costPerGallon;
		
		double totalCost = fuelCost + parkingFees + tolls;
		
		System.out.printf("Your total daily driving cost is: ₹%.2f\n", totalCost);
		
		sc.close();
	}

}
