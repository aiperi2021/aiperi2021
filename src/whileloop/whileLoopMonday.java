package whileloop;

import java.util.Scanner;

public class whileLoopMonday {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		String number = scan.next();
		// 1000
		convertDigits(number);
		
		while(number.length()>1) {
			String result;
			if (number.length() > 3 && number.length() <= 6) {
				result = "$" + number.substring(0, number.length() - 3) + "," + number.substring(number.length() - 3);
				System.out.println("Result is " + result);
			} else if (number.length() > 6) {
				result = "$" + number.substring(0, number.length() - 3) + "," + number.substring(number.length() - 4);
				System.out.println("Result is " + result);
			} else {
			}
			System.out.println("Must be greater than 3 digits.");		}
	}

	public static void convertDigits(String number) {
		String result;
		if (number.length() > 3 && number.length() <= 6) {
			result = "$" + number.substring(0, number.length() - 3) + "," + number.substring(number.length() - 3);
			System.out.println("Result is " + result);
		} else if (number.length() > 6) {
			result = "$" + number.substring(0, number.length() - 3) + "," + number.substring(number.length() - 4);
			System.out.println("Result is " + result);
		} else {
		}
		System.out.println("Must be greater than 3 digits.");
	}
}
