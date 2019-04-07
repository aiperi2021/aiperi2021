package casting;

import java.util.Scanner;

public class Grammer {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String m = input.nextLine();
		if(Character.isUpperCase(m.charAt(0))) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
