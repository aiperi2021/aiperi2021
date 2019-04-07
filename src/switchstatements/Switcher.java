package switchstatements;

public class Switcher {
	
	public static void main(String[] args) {
		String name = "John";
		
		switch(name) {
		case "James":
			System.out.println("James is a cool name");
			break;
		case "Jamie":
			System.out.println("Jamie is okey name");
			break;
		case "John":
			System.out.println("John Wick??");
			break; // exits the switch statement
		default:
			System.out.println("Everything else");
		}
		
//		 Convert same logic to if else statements
		if(name.equals("James")) {
			System.out.println("James is a cool name");
		}
		else if(name.equals("Jamie")) {
			System.out.println("Jamie is okey name");
		}
		else if(name.equals("John")) {
			System.out.println("John Wick??");
		}
		else {
			System.out.println("Everything else.");
		}
	}
	

}
