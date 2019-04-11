package methods;

import java.util.Random;

public class SocialMedia {
	
	public static void main(String[] args) {
		createUsername("Karim", "Benzema");
		createUsername("James", "Bond");
		createUsername("Gareth", "Bale");
		reverseString("School");
		reverseString("Camera");
		reverseString("Computer");
	}
	
	public static void reverseString(String word) {
		String result = "";
		for(int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		System.out.println(result);
	}

	public static void createUsername(String firstName, String lastName) {
		Random random = new Random();
		int r = random.nextInt(100);
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		String username = firstName + lastName + r;
		System.out.println(username);
	}
}
