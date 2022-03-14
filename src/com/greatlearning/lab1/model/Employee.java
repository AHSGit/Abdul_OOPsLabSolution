package com.greatlearning.lab1.model;

public class Employee {
	
	//Encapsulates variables 
	private String firstName, lastName;
	
	//Uses parameterized constructor of class Employee to pass firstName and lastName
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
