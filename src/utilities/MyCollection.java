package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	
	static Scanner input = new Scanner(System.in);
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> words){
		
		ArrayList<String> newList = new ArrayList<>();
		for(String w: words) {
			if(newList.contains(w)) {
				continue;
			}
			newList.add(w);
		}
		return newList;
	}
	
	public static ArrayList<String> filterList(ArrayList<String> words, int length){
		ArrayList<String> result = new ArrayList<>();
		for(String word: words) {
			if(word.length() == length) {
				result.add(word);
			}
		}
		return result;
	}
	
	public static ArrayList<String> getStringList(){
		ArrayList<String> words = new ArrayList<>();
		String response;
		do {
			System.out.println("Please enter String:");
			String s = input.nextLine();
			words.add(s);
			System.out.println("Do you wanna continue Y/N");
			response = input.nextLine();
		}while(response.equalsIgnoreCase("y"));
		System.out.println("Your list of string is returned.");
		return words;
	}

}
