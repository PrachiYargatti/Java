package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleProgram {
	
	public static void main(String[] args) {
		writeVehicles(); 
		readVehicles(); 
	}
	
	public static void readVehicles() {
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		try(FileInputStream fin = new FileInputStream("Vehicles.db")){
			try(DataInputStream din = new DataInputStream(fin)){
				while(true) {
					Vehicle v = new Vehicle();
					v.setVehicleId(din.readInt());
					v.setModel(din.readUTF());
					v.setType(din.readUTF());
					v.setPrice(din.readDouble());
					if(v.getPrice() > 0) {
						list.add(v);
					}
					else {
						System.out.println("skipped negative price "+v.getPrice());
						System.out.println();
					}
						
				}
			}//din.close();
		}//fin.close();
		catch(Exception e) {
			//do nothing
		}
		list.forEach(e -> System.out.println(e));
		
		System.out.println("\nSorted on price");
		class PriceComparator implements Comparator<Vehicle>{
			@Override
			public int compare(Vehicle x, Vehicle y) {
				int diff = (int) (y.getPrice() - x.getPrice());
				return diff;
			}	
		}
		Collections.sort(list, new PriceComparator());//anonymous object
		list.forEach(e -> System.out.println(e));
	}
	
	public static void writeVehicles() {
		List<Vehicle> list = new ArrayList<>();
		
        list.add(new Vehicle(1, "Mahindra Thar", "SUV", 1700000));
        list.add(new Vehicle(2, "Bajaj Pulsar 220F", "Motorbike", -140000));
        list.add(new Vehicle(3, "Hyundai Verna", "Sedan", 1300000));
        list.add(new Vehicle(4, "Ashok Leyland Dost+", "Commercial", 750000));
        list.add(new Vehicle(5, "Tesla Model S", "Electric", 8500000));
        
        try(FileOutputStream fout = new FileOutputStream("Vehicles.db")){
        	try(DataOutputStream dout = new DataOutputStream(fout)){
        		for(Vehicle v: list) {
        			if(v.getPrice() > 0) {
	        			dout.writeInt(v.getVehicleId());
	        			dout.writeUTF(v.getModel());
	        			dout.writeUTF(v.getType());
	        			dout.writeDouble(v.getPrice());
        			}	
        		}
        	}//dout.close();
        	System.out.println("Vehicles saved..");
        }//fout.close();
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
