package ifelsestatements;

import java.util.Scanner;

public class Credentials {

	public static void main(String[] args) {
		String username = "test";
		String password = "test123";
		// write code that takes the username and password from user on console
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter username: ");
		String enteredUsername = input.nextLine();
		System.out.println("Please enter password: ");
		String enteredPassword = input.nextLine();
		
		// Check if both username and password are matching, if matching 
		// print "Welcome, %username!!!"
		if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
			System.out.println("Welcome, " + enteredUsername + "!!!");
		}
//		 if username is correct but password is incorrect print "password incorrect"
		else if(enteredUsername.equals(username) && !enteredPassword.equals(password)) {
			System.out.println("Invalid password");
		}
		// if username is incorrect but password is correct print "username incorrect"
		else if(!enteredUsername.equals(username) && enteredPassword.equals(password)) {
			System.out.println("Invalid username");
		}
		// else print invalid credential
		else {
			System.out.println("Invalid Credentials");
		}
		// ! -> negative !str.equals(str2);
		
	}
}
