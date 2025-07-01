package com.app.fruits;

import java.util.Scanner;

class Fruit{
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		//todo
	}
	public Fruit(String name, double weight, String color) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "name: "+this.name+", color: "+this.color+", weight: "+this.weight;
	}
	public String taste() {
		return "no specific taste";
	}

}

class Apple extends Fruit{
	
	public Apple(String name, double weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
}

class Mango extends Fruit{
	
	public Mango(String name, double weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
}

class Orange extends Fruit{
	
	public Orange(String name, double weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public String taste() {
		return "sour";
	}
}

public class FruitBasket {

	private static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		int choice;
		System.out.println("\n0.Exit");
		System.out.println("1.Add mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in the basket");
		System.out.println("5.Display name, color, weight(in kg), taste of all fresh fruits, in the basket.");
		System.out.println("6.Mark a fruit as stale");
		System.out.println("7.Display tastes of all stale(not fresh) fruits in the basket");
		System.out.print("Enter the choice: ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter basket size: ");
		int size = sc.nextInt();
		
		Fruit[] basket = new Fruit[size];
		
		int choice, counter = 0;
		
		while((choice = menuList()) != 0) {
			
			switch(choice) {
			
			case 1:
				if(counter < basket.length) {
					System.out.print("\nEnter name, weight(in kg), color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Mango(name, weight, color);
					System.out.println("Mango is added successfully in the basket.");
				}
				else {
					System.out.println("Basket full!");
				}
				break;
				
			case 2:
				if(counter < basket.length) {
					System.out.print("\nEnter name, weight(in kg), color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Orange(name, weight, color);
					System.out.println("Orange is added successfully in the basket.");
				}
				else {
					System.out.println("Basket full!");
				}
				break;
				
			case 3:
				if(counter < basket.length) {
					System.out.print("\nEnter name, weight(in kg), color: ");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[counter++] = new Apple(name, weight, color);
					System.out.println("Apple is added successfully in the basket.");
				}
				else {
					System.out.println("Basket full!");
				}
				break;
				
			case 4:
				System.out.println("\nNames of all fruits in the basket: ");
				for (Fruit f: basket) {
					if(f != null) {
						System.out.println(f.getName());
					}
				}
				break;
				
			case 5:
				System.out.println("\nName, Color, Weight & taste of all fresh fruits, in the basket: ");
				for (Fruit f: basket) {
					if(f != null && f.isFresh()) {
						System.out.println(f.toString() + ", taste: " + f.taste());
					}
				}
				break;
				
			case 6:
				System.out.print("\nEnter index to mark stale: ");
				int index = sc.nextInt();
				if(index >= 0 && index < counter && basket[index] != null) {
					basket[index].setFresh(false);
					System.out.println(basket[index].getName() +" marked as stale.");
				}
				else {
					System.out.println("Invalid index.");
				}
				break;
				
			case 7:
				System.out.println("\nTastes of all stale(not fresh) fruits in the basket.");
				for(Fruit f: basket) {
					if(f != null && !f.isFresh()) {
						System.out.println(f.taste());
					}
				}
				break;
			
			case 0:
				System.out.println("\nExited successfully.");
				break;
			
			default:
				System.out.println("\nInvalid choice.");
			}	

		}
	}
}
