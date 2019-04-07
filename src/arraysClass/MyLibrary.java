package arraysClass;

import java.util.Arrays;
import java.util.Scanner;

public class MyLibrary {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] mybooks = {"OCA", "Zero to One", "Unbeatable mind", "100$ startup", "Mind power"};
		System.out.println("Please enter the book to replace: ");
		String oldBook = input.nextLine();
		System.out.println("Please enter the new book:");
		String newBook = input.nextLine();
		Arrays.sort(mybooks);
		System.out.println(Arrays.toString(mybooks));
		int result = Arrays.binarySearch(mybooks, oldBook);
		if(result >= 0) {
			mybooks[result] = newBook;
		}
		System.out.println(Arrays.toString(mybooks));
		
	}

}





