package tasks;

import java.util.Random;
import java.util.Scanner;

public class MessageSending {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message;
		boolean sent, delivered;
		System.out.println("Please enter your message:");
		message = input.nextLine();
		if(message.length() >= 15) {
			sent = true;
		}
		else {
			sent = false;
		}
		
		// TASK Part II
		// declare boolean for 'delivered' status
		// generate random number 0 - 10
		// check generated number. If even then set 'delivered' to true
		// if number is odd set 'delivered' status to false
		// Move the full message info to the bottom and add 'delivered' status
		Random random = new Random();
		int r = random.nextInt(10);
		
		if(r % 2 == 0) {
			delivered = true;
		}else {
			delivered = false;
		}
		System.out.println("Message: " + message);
		System.out.println("Sent: " + sent);
		System.out.println("Delivered: " + delivered);
	}

}





