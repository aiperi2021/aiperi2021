package ifelsestatements;

import java.util.Scanner;

public class FindMaxNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		System.out.println("Please enter two integers:");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		if(number1 > number2) {
			System.out.println("Max Number: " + number1);
		}
		else {
			System.out.println("Max Number: " + number2);
		}
		
		// shortcut for importing --> command + shift + o
		// Where should you create scanner? beginning, end?
		// -> before you use scanner you must create. 
		
		
	}

}
