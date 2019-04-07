package stringmanipulation;

import java.util.Scanner;

public class NoU {
	
	public static void main(String[] args) {
		// Write a program that asks message from user
		// replace all 'u' and 'U' with empty string
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String message = input.nextLine().toLowerCase();
		message = message.replace("u", "");
//		message = message.replace("U", "");
		System.out.println(message);
		
	}

}
