package methods;

public class Computer {
	
	public static void main(String[] args) {
		int m = getMemory();
		System.out.println(m);
		String date = getDate();
		System.out.println(date);
		
	}
	
	public static String getDate() {
		return "April 13";
		
	}
	
	public static int getMemory() {
		System.out.println("Returning the computer memory");
		return 512;
	}
	
	
	
	
	
	
	
	
	public static void turnOn() {
		System.out.println("Computer is turning on");
	}
	
	
	
	

}
