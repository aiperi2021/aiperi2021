package switchstatements;

public class StringTest {
	
	public static void main(String[] args) {
		// What data types switch statement supports
		char b = 'A';
		switch(b) {
		case 'A':
			System.out.println("something 3");
			break;
		case 'B':
			System.out.println("it's five");
			break;
			default:
				System.out.println("Def");
		}
	}

}
