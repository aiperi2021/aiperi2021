package loops;

import java.util.Scanner;

public class RacistPerson {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(;;) {
			System.out.println("What is your name?");
			String name = input.nextLine();
			if(name.equalsIgnoreCase("james")) {
				continue;
			}
			System.out.println("Good job, " + name);
		}
	}

}
