package stackAndHeap;

import java.util.ArrayList;

public class SbTask {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome("civic"));
		System.out.println(removeCon("convert"));
		System.out.println(removeCon("School", "ch"));
		ArrayList<String> w = new ArrayList<>();
		w.add("car");
		w.add("so");
		w.add("it");
		System.out.println(w);
		insertHello(w, "BOX");
	}
	
	public static void insertHello(ArrayList<String> words, String target) {
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() == 2) {
				StringBuilder sb = new StringBuilder(words.get(i));
				sb.insert(1, target);
				words.set(i, sb.toString());
			}
		}
		System.out.println(words);
	}
	
	public static void insertHello(ArrayList<String> words) {
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() == 2) {
				StringBuilder sb = new StringBuilder(words.get(i));
				sb.insert(1, "hello");
				words.set(i, sb.toString());
			}
		}
		System.out.println(words);
	}
	
	public static String removeCon(String word, String target) {
		word = word.toLowerCase();
		if(word.length() < target.length()) {
			System.out.println("Invalid data");
			return "";
		}
		else if(word.trim().contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}
		else if(!word.contains(target.toLowerCase())) {
			return word;
		}
		else {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(sb.indexOf(target.toLowerCase()), sb.indexOf(target.toLowerCase()) + target.length());
			return sb.toString();
		}
		
	}
	
	public static String removeCon(String word) {
		word = word.toLowerCase();
		if(word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		else if(word.trim().contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}
		else if(!word.contains("con")) {
			return word;
		}
		else {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(sb.indexOf("con"), sb.indexOf("con") + 3);
			return sb.toString();
		}
		
	}
	
	public static boolean isPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reversed = sb.reverse().toString();
		if(reversed.equals(word)) {
			return true;
		}else {
			return false;
		}
	}

}
