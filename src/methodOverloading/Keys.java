package methodOverloading;

public class Keys {
	
	public static void main(String[] args) {
		int b = 45;
		calculate(b);
	}
	
	public static void calculate(long s) {
		System.out.println("Long is calculating " + s);
	}
	
	public static void calculate(float i) {
		System.out.println("Float is calculating " + i);
	}

}
