package encapsulationTask;

public class SM {
	
	public static void main(String[] args) {
		Post p1 = new Post("What a come back!");
		p1.info();
		p1.like();
		p1.like();
		p1.addComment("Yeah I know right");
		p1.info();
		p1.addComment("What the hell was that??");
		p1.info();
		
	}

}
