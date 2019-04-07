package tasks;

import java.util.Scanner;

public class SpecialJames {
	
	// Write a program that asks the name from the user
	// if they enter james then ask their last name
	// if their name is not james then don't ask the last name. 
//	NOTE: Use if statement
	// give value "nobody" if the name is not james
    // print first name and last name in the end of the program
	// variables: firstName, lastName
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName;
		System.out.println("What is your name?");
		firstName = input.nextLine();
		if(firstName.equalsIgnoreCase("James")) {
			System.out.println("What is your last name?");
			lastName = input.nextLine();
		}else {
			lastName = "Nobody";
		}
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
	}
}













