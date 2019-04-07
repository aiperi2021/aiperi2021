package switchstatements;

import java.util.Scanner;

public class KnowledgeValidator {
	
	// Write a program that asks Grade from user
	// User must enter one character they are
	// A, B, C, D, F
	// Switch based on the characters and print proper messages
	// MUST USE STRING
	// Check for the length of the Grade. If not one character give them proper
	// message.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade:");
		String grade = input.nextLine();
		
		grade = grade.toUpperCase();
		
		if(grade.length() > 1) {
			System.out.println("Invalid data. Please enter one character.");
		}
		else {
			switch(grade) {
			case "A":
				System.out.println("Great job!");
				break;
			case "B":
				System.out.println("Okey job");
				break;
			case "C":
				System.out.println("Not bad");
				break;
			case "D":
				System.out.println("Try harder");
				break;
			case "F":
				System.out.println("Failed!");
				break;
				default:
					System.out.println("Invalid Grade");
			}
		}
		
		
	}
	
	

}
