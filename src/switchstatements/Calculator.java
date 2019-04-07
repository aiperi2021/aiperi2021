package switchstatements;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number1, number2, result = 0;
		String operator;
		boolean invalidOperator = false;
		System.out.println("Please enter two double values:");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		System.out.println("Please choose operator below:\n*, /, +, -");
		operator = input.next();
		
		switch(operator) {
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		default:
			System.out.println("Invalid operator. Please try agian!");
			// somehow give a flag about the invalid operator
			invalidOperator = true;
		}
		if(invalidOperator == false) {
			// !false -> true
			// !true -> false
			System.out.println("Result of " + number1 + " " + operator + " " + number2 + " is " + result);
		}
		
		
	}

	
	
	
	
	
}
