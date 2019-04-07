package loops;

public class Break {
	
	// Break the loop after "Hello" printed 13 times
	
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			System.out.println("Hello");
			if(i == 12) {
				break;
			}	
		}
	}

}
