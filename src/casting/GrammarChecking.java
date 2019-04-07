package casting;

import java.util.Scanner;

public class GrammarChecking {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String message = input.nextLine().trim();
		char firstChar = message.charAt(0);
		int decimalValue = firstChar;
		
		System.out.println(decimalValue);
		if(decimalValue >= 65 && decimalValue <= 90 && (message.endsWith(".") || message.endsWith("!"))) {
			System.out.println("Valid message");
		}else {
			System.out.println("Invalid message");
		}
		
		boolean bb = Character.isUpperCase('e');
		// isUpperCase() -> method that takes char and checks if it is upper case or not.
		// this method returns boolean, true or false. 
		System.out.println(bb);
		int ii = 'A';
		
	}

}





