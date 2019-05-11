package stackAndHeap;

public class Recursion {
	
	public static void main(String[] args) {
		String s1 = new String("James");
		String s2 = new String("James");
		String s3 = "James";
		String s4 = "James";
		String s5 = "James";
		String s6 = new String("James");
		String s7 = "Adam";
		System.out.println(s1.hashCode());
		System.out.println(s7.hashCode());
		
	}
	
	public static void hi() {
		System.out.println("Hi");
		hi();
	}

}
