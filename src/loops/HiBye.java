package loops;

import java.util.Scanner;

public class HiBye {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		for( ; ; ) {
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("hi")) {
				System.out.println("Hello");
			}else if(answer.equals("exit")) {
				break;
			}
			else {
				System.out.println("Good bye");
			}
		}
//		System.out.println("This is the end of program");
		
	}

}
