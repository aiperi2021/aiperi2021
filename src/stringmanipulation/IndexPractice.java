package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {
	
	public static void main(String[] args) {
		
		// Write a program that detects bad words
//		heck, silly, idiot
		// Ask from user to enter the message to send
		// Check if message contains above bad words
		// If message contains any of those words print "Message failed"
		// Otherwise print "Message sent"
		// NOTE: YOU MUST USE INDEX OF METHOD
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message to send:");
		String message = input.nextLine().toLowerCase().trim();
		
		int first = message.indexOf("heck");
		int second = message.indexOf("silly");
		int third = message.indexOf("idiot");
		
		
		System.out.println(first + ", " + second + ", " + third);
//		first == -1 && second == -1 && third == -1
		
		if(first >= 0 || second >= 0 || third >= 0) {
			System.out.println("Message fail!");
		}
		else {
			System.out.println("Message sent!");
		}
		
	}

	
	
	
	
	
	
	
}
