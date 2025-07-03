package com;

public class Person {
	
	private String name;
	private MyDate dateOfBirth;
	
	public Person() {
		
	}
	
	public Person(String name, MyDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
		return "name: " + name + ", date of birth: " + dateOfBirth;
	}
}
