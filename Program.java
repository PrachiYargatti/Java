package com;

import java.util.Scanner;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("\n---menu---");
		System.out.println("1.Add Employee");
		System.out.println("2.Display All Employees");
		System.out.println("3.Search Employee by ID");
		System.out.println("4.Display Employees joined in given year");
		System.out.println("5.Find Employee with Maximum Salary");
		System.out.println("6.Find Employee with Minimum Salary");
		System.out.println("7.Exit");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[10];
		
		int counter = 0;
		int choice;
		
		while((choice = menuList()) != 7) {
			
			switch (choice) {
				
				case 1:
					if(counter < emp.length) {
						System.out.print("\nEnter your name: ");
						String name = sc.next();
						System.out.print("Enter your birth date (dd mm yyyy): ");
						MyDate dateOfBirth = new MyDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
						System.out.print("Enter your id: ");
						int id  = sc.nextInt();
						System.out.print("Enter your department: ");
						String dept = sc.next();
						System.out.print("Enter your salary: ");
						double salary = sc.nextDouble();
						System.out.print("Enter your joining date (dd mm yyyy): ");
						MyDate dateOfJoining = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
						emp[++counter] = new Employee(name, dateOfBirth, id, dept, salary, dateOfJoining);
					}
					else {
						System.out.println("Employee array is full");
					}
					break;
					
				case 2:
					System.out.println("\nDisplay all employees");
					for (Employee e: emp) {
						if(e != null) {
							System.out.println(e);
						}
					}
					break;
					
				case 3:
					System.out.println("\nSearch Employee by ID");
					System.out.print("enter employee id: ");
					int searchId = sc.nextInt();
					boolean found = false;
					for (Employee e: emp) {
						if(e != null && e.getId() == searchId) {
							System.out.println(e);
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("id not found.");
					}
					break;
					
				case 4:
					System.out.println("\nDisplay Employees joined in given Year");
					System.out.print("enter year");
					int year = sc.nextInt();
					boolean yearFound = false;
					for (Employee e: emp) {
						if(e != null && e.getDateOfJoining().getYear() == year) {
							System.out.println(e.toString());
							yearFound = true;
						}
					}
					if(!yearFound) {
						System.out.println("No employee joined in the year " + year);
					}
					break;
					
				case 5:
                    Employee maxEmp = null;
                    for (Employee e : emp) {
                        if (e != null && (maxEmp == null || e.getSalary() > maxEmp.getSalary())) {
                            maxEmp = e;
                        }
                    }
                    if (maxEmp != null) 
                    	System.out.println("Employee with Max Salary:\n" + maxEmp);
                    else 
                    	System.out.println("No employees to evaluate.");
                    break;

                case 6:
                    Employee minEmp = null;
                    for (Employee e : emp) {
                        if (e != null && (minEmp == null || e.getSalary() < minEmp.getSalary())) {
                            minEmp = e;
                        }
                    }
                    if (minEmp != null) 
                    	System.out.println("Employee with Min Salary:\n" + minEmp);
                    else 
                    	System.out.println("No employees to evaluate.");
                    break;

                default:
                    System.out.println("Invalid choice.");
			}
		}
	}

}
