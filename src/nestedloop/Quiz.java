package nestedloop;

public class Quiz {
	// !false ==> true
	// !true ==> false
	public static void main(String[] args) {
		boolean f = false;
		System.out.println(f);
		f = true;
		
		while(f) {
			System.out.println("hello");
			f = false;
		}
		System.out.println("Ending");
	}

}
