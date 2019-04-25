package objectCreationTasks;

import java.util.Scanner;

public class BookStore {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many books you want:");
		int bookNums = input.nextInt();
		input.nextLine();
		Book [] myBooks = new Book[bookNums];
		
		for(int i = 0; i < bookNums; i++) {
			Book b = new Book();
			System.out.println("Enter title for book " + (i+1));
			b.title = input.nextLine();
			System.out.println("Enter author for book " + (i+1));
			b.author = input.nextLine();
			System.out.println("Enter pages for book "+ (i+1));
			b.pages = input.nextInt();
			input.nextLine();
			myBooks[i] = b;
		}
		
		System.out.println(myBooks[0].title);
		System.out.println(myBooks.length);
		
		
		
	}

}
