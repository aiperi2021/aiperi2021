package whileloop;

import java.util.Scanner;

public class NumberGuessing {
	
	public static void main(String[] args) {
		int secretNum = 45;
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number?");
		int guess = input.nextInt();
		
		while(guess != secretNum) {
			System.out.println("Wrong! Enter your guess?");
			guess = input.nextInt();
		}
		System.out.println("Congrats!");
	}

}
