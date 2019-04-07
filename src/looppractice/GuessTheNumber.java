package looppractice;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(101);
		System.out.println(target);
		int userInput;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter your input:");
			userInput = input.nextInt();
			if(userInput < target) {
				System.out.println("Your input is too low!");
			}
			else if(userInput > target) {
				System.out.println("Your input is too high!");
			}else {
				System.out.println("CONGRATULATIONS!");
				break;
			}
		}
		
//		do {
//			System.out.println("Please enter your input:");
//			userInput = input.nextInt();
//			if(userInput < target) {
//				System.out.println("Your input is too low!");
//			}
//			else if(userInput > target) {
//				System.out.println("Your input is too high!");
//			}else {
//				System.out.println("CONGRATULATIONS!");
//			}
//		}while(target != userInput);
		
	}

}




