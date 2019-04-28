package objectCreationTasks;

public class School {
	
	public static void main(String[] args) {
		String ss = "Hello";
		System.out.println(ss);
		Student s1 = new Student();
		s1.name = "Ibrahim";
		s1.age = 12;
		s1.email = "ibr@gmail.com";
		
//		s1.read();
		
		Book b = new Book();
		b.title = "Future of SDET";
		b.author = "James Bond";
		b.pages = 230;
		
//		b --> one full book. That has title, pages and author. 
		s1.read(b);
		int i = 2;
		s1.read(i);
		
		Book b2 = new Book();
		b2.title = "OCA Study guide";
		b2.author = "Scott Selikoff";
		b2.pages = 351;
		b2.language = "English";
		
		
		
	}

}





