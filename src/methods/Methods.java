package methods;

public class Methods {

	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			prints();
		}
		System.out.println("What's going on");
		for(int i = 0; i < 50; i++) {
			prints();
		}
		
	}
	
	public static void prints() {
		System.out.println("James");
	}
	
	public static void printJames50() {
		for(int i = 0; i < 50; i++) {
			System.out.println("James");
		}
	}
}
