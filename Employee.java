package com;

public class Employee extends Person{
	private int id;
	private String department;
	private double salary;
	MyDate dateOfJoining;
	
	public Employee() {
		
	}
	
	public Employee(String name, MyDate dateOfBirth, int id, String department, double salary, MyDate dateOfJoining) {
		super(name, dateOfBirth);
		this.id = id;
		this.department = department;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		super.toString();
		return "Employee [id=" + id + ", department=" + department + ", salary=" + salary + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
}
