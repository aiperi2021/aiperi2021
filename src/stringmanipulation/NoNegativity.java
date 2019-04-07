package stringmanipulation;

import java.util.Scanner;

public class NoNegativity {
	
	public static void main(String[] args) {
		// Write a program that asks message from the user
		// replace word "hate" with "love"
		// print new version of the message
		// I hate youuu! --> I love youuu!
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String message = input.nextLine().toLowerCase();
		
		message = message.replace("hate", "love");
		System.out.println(message);
		
	}

}
