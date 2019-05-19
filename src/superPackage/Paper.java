package superPackage;

public class Paper {
	
	final static int numOfPapers;
	static String s;
	
	static {
		numOfPapers = 50;
		s = "Sunday";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Paper.numOfPapers);
		Paper p1 = new Paper();
		
		System.out.println(p1.numOfPapers);
		System.out.println(Paper.numOfPapers);
		
	}

}
