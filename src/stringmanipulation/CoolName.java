package stringmanipulation;

import java.util.Scanner;

public class CoolName {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		name = name.toLowerCase().trim();
		System.out.println("Name: " + name);
		
		
		
		boolean check = name.isEmpty();
		if(check) {
			System.out.println("Invalid name");
		}else {
			char first = name.charAt(0);
			char last = name.charAt(name.length() - 1);
			if(first == 'a' && last == 'z') {
				System.out.println("Cool");
			}else {
				System.out.println("Not very cool");
			}
		}
		
		
		
		// Modify the code to check if name is empty
		// If empty then print "Enter valid name"
		// if not empty apply the logic 
	}

}
