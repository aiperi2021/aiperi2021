package methods;

public class Numbers {
	
	public static void main(String[] args) {
		printOdd50();
		welcome("John");
		welcome("Adam");
		printOdd(30);
	}
	
	// printing odd numbers from 0 - 50
	public static void printOdd50() {
		for(int i = 0; i < 50; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void welcome(String name) {
		System.out.println("Welcome, " + name + "!");
	}
	
	public static void printOdd(int limit) {
		
		for(int i = 0; i < limit; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	
}
