package methods;

import java.util.Scanner;

public class Battery {
	
	public static void main(String[] args) {
		navigate("Cybertek", "Library");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name:");
		String name = input.nextLine();
		checkLength(name, 8);
	}
	
	public static void checkLength(String word, int number) {
		if(word.length() == number) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
	}
	
	public static void navigate(String origin, String destination) {
//		System.out.println("GPS is navigating from " + origin + " to " + destination);
		System.out.println("Hello World");
	}

}
