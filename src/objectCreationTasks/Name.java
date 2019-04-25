package objectCreationTasks;

import java.util.Scanner;

public class Name {
	
	public static void main(String[] args) {
		String [] names= new String[3];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Please enter the name:");
			String n = input.nextLine();
			names[i] = n;
		}
		
		
	}

}
