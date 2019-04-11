package WednesdayRecap;

import java.util.Scanner;

public class BaseClass {

	public static void printNames() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter names to print:");
		System.out.println("Entered name: " + scanner.nextLine());
	}

	public static void printNames3() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter names to print:");
		System.out.println("Entered name: " + scanner.nextLine());
	}

	public static void printNames2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter names to print:");
		System.out.println("Entered name: " + scanner.nextLine());
	}

	public String getFullName() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name to print:");
		String firstName = scanner.nextLine();
		System.out.println("Enter first last name to print:");
		String lastName = scanner.nextLine();

		// System.out.println("Entered thing is : " + firstName + " " + lastName);
		return lastName;
	}

	public void printProvidedName(String name) {

		System.out.println("Printing provided name: " + name);
	}

}
