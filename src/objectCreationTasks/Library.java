package objectCreationTasks;

public class Library {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Zero to One";
		book1.author = "Blake Masters";
		book1.pages = 150;
		
		Book book2 = new Book();
		book2.title = "10 x";
		book2.author = "Grant Cardone";
		book2.pages = 200;
		
		Book book3 = new Book();
		book3.title = "Crime and punishment";
		book3.author = "Dostoevkii";
		book3.pages = 647;
		
		Book [] myBooks = new Book[3];
		myBooks[0] = book1;
		myBooks[1] = book2;
		myBooks[2] = book3;
		
		for(Book b: myBooks) {
			System.out.println(b.author);
		}
	}

}
