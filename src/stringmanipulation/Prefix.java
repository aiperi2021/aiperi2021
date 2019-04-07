package stringmanipulation;

public class Prefix {
	
	public static void main(String[] args) {
		String weather = "Really good";
		boolean check = weather.startsWith("Really good");
//		System.out.println(check);
		boolean check2 = weather.endsWith("Really good");
//		System.out.println(check2);
		boolean b = weather.startsWith("ly", 4);
//		"ly" -> string we want to check
//		4 -> index where we want to start looking
//		System.out.println(b);
		
		String s = "525572ACCD";
		
		
		boolean checkAccount = s.startsWith("2");
		System.out.println(checkAccount);
		if(checkAccount) {
			System.out.println("Cool");
		}else {
			System.out.println("Not cool");
		}
	}
}
