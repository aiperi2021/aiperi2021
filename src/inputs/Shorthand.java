package inputs;

public class Shorthand {
	
	public static void main(String[] args) {
		int hours = 70;
		String name = "James";
		
		hours %= 60; // --> minutes = minutes % 60;
		System.out.println(hours);
		hours*=3; // minutes = minutes * 3;
		System.out.println(hours);
		
	}

}
