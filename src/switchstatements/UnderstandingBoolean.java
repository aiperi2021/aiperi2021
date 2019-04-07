package switchstatements;

import java.util.Scanner;

public class UnderstandingBoolean {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		boolean currentStudent;
		System.out.println("Please enter your name:");
		name = input.nextLine();
		System.out.println("Are you a student currently?\nyes/no");
		// if user says yes currentStudent value should be true
		// if no then currentStudent value should be false
		String response = input.nextLine();
		if(response.equals("yes")) {
			currentStudent = true;
		}else {
			currentStudent = false;
		}
		System.out.println("Name: " + name);
		System.out.println("Current student: " + currentStudent);
		// print "%name you rock" if the user is student currently.
		if(currentStudent) {
			System.out.println(name + " you Rock!!");
		}
		
	}

}









