package com.greatlearning.lab1.service;

import java.util.Random;

import com.greatlearning.lab1.model.Employee;

public class CredentialService {
	
	//generates and returns email address of syntax firstNamelastName@department.company.com
	public String generateEmailAddress(String firstName, String lastName, String deptName) {
		
		String emailID = firstName + lastName + "@" + deptName + ".abc.com";
		return emailID;		
	}
	
	//generates and returns randomly generated 10 digit password using a character array
	public char[] generatePassword() {
		
		int length = 10;
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String symb = "!@#$%^&*";
		String pwd = upper + lower + num + symb;
		
		//Using Random class to randomize password from given string of allowed characters
		Random random = new Random();
		
		char[] password = new char[length];
		
		for (int i = 0; i<length; i++) {
			password[i] = pwd.charAt(random.nextInt(pwd.length()));			
		} 
		
		return password;
	}
	
	//Displays the generated credentials to the user
	public void showCredentials(Employee employee, String emailID, char[] password) {
		
		System.out.println("\nDear " + employee.getFirstName() + ", your generated credentials are as follows: ");
		System.out.println("Email Address: " + emailID);
		System.out.println("Password: " + new String(password));
	}


}
