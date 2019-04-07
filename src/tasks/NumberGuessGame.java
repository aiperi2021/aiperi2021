package tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean found = false;
		int counter = 0;
		// shortcut for importing the classes command + shift + o
		int secretNumber = random.nextInt(10);
		System.out.println("Please guess the number between 0 and 10");
		int enteredNumber = input.nextInt();
		
		if(enteredNumber > secretNumber) {
			System.out.println("Your guess is too high!");
		}
		else if(enteredNumber < secretNumber) {
			System.out.println("Your guess is too low!");
		}
		else {
			System.out.println("Congratulations! You got it!");
			counter = 1;
		}
		
		// Give second chance to the user to guess the number
		// if they find the number print "congrats" if not print "Lost"
		System.out.println("Counter: " + counter);
		if(counter == 0) { // true == false --> false
			System.out.println("This is your last chance. Please guess the number:");
			int secondGuess = input.nextInt();
			if(secondGuess == secretNumber) {
				System.out.println("Congratulations!");
			}else {
				System.out.println("You LOST!!");
			}
		}
		System.out.println("Secret number was: " + secretNumber);
	}

	
	
	
	
	
	
	
	
}
