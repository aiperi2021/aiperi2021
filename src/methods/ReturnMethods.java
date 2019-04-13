package methods;

public class ReturnMethods {
	public static void main(String[] args) {
		String w = "concert";
		System.out.println(remove3letters(w, "nce"));
	}
	
	// Write a method Part II.
	// Method should accept 2 Strings. 
	//1 - data. 2 - String we want to remove(3 letters)
	// Every single rules for previous version is same for this method too. 
	public static String remove3letters(String word, String letters) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word.contains(letters)) {
			return word.replace(letters, "");
		}else {
			return word;
		}
	}
	
	
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
			
		}
		if(word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		}else {
			return word;
		}
	}
}
