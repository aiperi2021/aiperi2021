package loops;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter your password:");
			String pass = input.nextLine();
			
			if(pass.equals("secret478")) {
				System.out.println("Welcome to your Profile!");
				break;
			}
			if(i == 2) {
				System.out.println("Your account is locked. Try after 5 hours");
				break;
			}
		}
	}

}
