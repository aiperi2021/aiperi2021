package ifelsestatements;

import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		// Write a code that asks from user to create password
		// password must be at least 5 characters and maximum of 12 character.
		// If user passes valid password print "%password created"
		// if user passes  invalid password check for length
			// if length is less than 5 chars print "password length too short"
			// if length is more than 12 chars print "password too length long"
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a password to create:");
		String password = input.nextLine();
		int lengthOfPassword = password.length();
		
		if(lengthOfPassword >= 5 && lengthOfPassword <= 12) {
			System.out.println(password + " created!");
		}
		else {
			
			if(lengthOfPassword < 5) { 
				System.out.println("Password length is too short");
				System.out.println("Try longer password");
			}
			
			else {
				System.out.println("Password length is too long");
				System.out.println("Try shorter password");
			}
		}
	}

}
