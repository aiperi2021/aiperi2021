package stringmanipulation;

import java.util.Scanner;

public class MultipleWords {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		
		boolean multipleWords;
		System.out.println("Please enter the string");
		 str = input.nextLine();
		str = str.trim();
		//boolean check = str.contains(" ");
		// Modify a program to check if user entered some data or empty string.
		// if user entered empty string then print "Please enter data"
		// If user entered valid data then check if multiple words or not
		
		if(str.isEmpty()) {
			System.out.println("Please enter data");
		}else {
			if(str.contains(" ")) {
				multipleWords = true;
			}else {
				multipleWords = false;
			}
			System.out.println("Multiple words: " + multipleWords);
		}
		
	}
	
	
	
	
	
	
}
