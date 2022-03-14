package com.greatlearning.lab1.driver;

import java.util.Scanner;

import com.greatlearning.lab1.model.Employee;
import com.greatlearning.lab1.service.CredentialService;

public class MainDriver {

	public static void main(String[] args) {
		
		//Creating object of Employee class to pass values into parameterized constructor
		Employee employee = new Employee("Abdul", "Shaikh");
		
		//Creating object of CredentialService class used to generate credentials
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPwd;		
		
		//Input menu
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal\n");
			
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();	
		
		//Using switch-case to determine department and generate email domain based on user input
		switch(choice) {		
		case 1: 
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech"); 
			generatedPwd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPwd);
			break;
		
		case 2:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin"); 
			generatedPwd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPwd);
			break;
		
		case 3:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr"); 
			generatedPwd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPwd);
			break;
			
		case 4:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal"); 
			generatedPwd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPwd);
			break;
			
		default:
			System.out.println("\nInvalid Choice! Please enter values between 1 to 4!");
			break;
			
		} sc.close(); 
		
	}

}
