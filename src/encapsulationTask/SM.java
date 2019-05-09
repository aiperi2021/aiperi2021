package encapsulationTask;

public class SM {
	
	public static void main(String[] args) {
//		Post p1 = new Post("What a come back!");
//		p1.info();
//		p1.like();
//		p1.like();
//		p1.addComment("Yeah I know right");
//		p1.info();
//		p1.addComment("What the hell was that??");
//		p1.info();
//		int i = 45;
//		System.out.println("Hello world");
//		i = 45;
		
//		User james = new User("James Milner", 31);
//		User lucas = new User("Lucas Podolski", 19);
//		james.sendFriendRequest(lucas);
//		james.createPost("What a comeback!!");
//		james.createPost("Greate day today!");
//		
//		User.seeTimeline(james);
//		lucas.info();
//		lucas.createPost("My first day at work!");
//		lucas.createPost("Who is doing what??");
//		lucas.createPost("I am about to sleep");
//		User.seeTimeline(lucas);
		User adam = User.createProfile();
		User james = new User("James Bond", 43);
		User.seeAllUsers();
		
	}

}












