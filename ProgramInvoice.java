package com.dkte;

import java.util.Scanner;

class Invoice{
	private String partNum;
	private String description;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(){ //parameter less constructor
		this("1234", "good product", 2, 200.00);
	}

	public Invoice(String partNum, String description, int quantity, double price) { //parameterized constructor
		this.partNum = partNum;
		this.description = description;
		this.quantity = quantity;
		pricePerItem = price;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNumber) {
		this.partNum = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public double calcInvoiceAmt() {
		if (this.quantity < 0) {  //If the quantity is not positive, it should be set to 0.
			this.quantity = 0;
		}
		if (this.pricePerItem < 0) {  //If the price per item is not positive, it should be set to 0.0.
			this.pricePerItem = 0.0;
		}
		return this.quantity * this.pricePerItem;
	}
}

class InvoiceTest{
	Invoice iv = new Invoice();
	
	Scanner sc = new Scanner (System.in);
	
	public void acceptRecord() {
		
		System.out.print("\nenter part number: ");
		iv.setPartNum(sc.nextLine());
		
		System.out.print("enter description: ");
		iv.setDescription(sc.nextLine());
		
		System.out.print("enter quantity: ");
		iv.setQuantity(sc.nextInt());
		
		System.out.print("enter price per item: ");
		iv.setPricePerItem(sc.nextDouble());
	}
	
	public void printRecord() {
		System.out.println("\nPart Number: " + iv.getPartNum());
		System.out.println("Description: " + iv.getDescription());
		System.out.println("Quantity: " + iv.getQuantity());
		System.out.println("Price Per Item: " + iv.getPricePerItem());
		System.out.println("Calculated Invoice Amount: " + iv.calcInvoiceAmt());
	}
}

public class ProgramInvoice {

	public static void main(String[] args) {
		
		InvoiceTest it = new InvoiceTest();
		it.printRecord(); //constructor chaining
		
		it.acceptRecord();
		it.printRecord();
	}

}
