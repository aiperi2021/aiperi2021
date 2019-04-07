package stringmanipulation;

public class NameValidation {
	
	public static void main(String[] args) {
		String name = "Lawr ence";
		boolean check = name.contains(" "); // returns boolean.
		System.out.println(check);
		String str = "Apple Inc. is an Ame\"rican multinational technology company ";
		String s = "\"";
		boolean b = str.contains(s);
		System.out.println(b);
		
		
	}

}
