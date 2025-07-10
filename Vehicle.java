package com;

public class Vehicle {
	private int vehicleId;
	private String model;
	private String type;
	private double price;
	
	public Vehicle() {
		
	}
	public Vehicle(int vehicleId, String model, String type, double price) {
		this.vehicleId = vehicleId;
		this.model = model;
		this.type = type;
		this.price = price;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}
	
}
