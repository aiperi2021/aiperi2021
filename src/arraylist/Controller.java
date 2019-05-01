package arraylist;

import java.util.ArrayList;

import constructors.Phone;

public class Controller {
	
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<>();
		// Object representation of int
		
		ages.add(23);
		ages.add(120);
		
		String s = "34";
		Integer.valueOf(s);// --> 34 -> Integer
		Integer.parseInt(s); // --> 34 -> int
		
		int a = Integer.parseInt(s);
		// How to use custom datatype using Arraylist.
		ArrayList<Phone> phones = new ArrayList<>();
		
		
	}

}
