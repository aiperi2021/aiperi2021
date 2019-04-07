package whileloop;

public class ApplicationLogin {
	
	public static void main(String[] args) {
		
		int counter = 14;
		// Print "It's raining" while counter is less than 15.
		// counter value increments by 1 for each iteration.
//		while(counter < 16) {
//			System.out.println("It's raining - " + counter);
//			counter++;
//		}
		
		do {
			System.out.println("It's raining - " + counter);
			counter++;
		}while(counter < 16);
		
	}

}
