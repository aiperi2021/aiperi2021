package arrays;

import java.util.Arrays;

public class Person {
	
	public static void main(String[] args) {
		int [] ages = new int[100];
		// Store different integer values to each index and print them all
		ages[0] = 18;
		ages[1] = 45;
		ages[2] = 66;
		ages[4] = 22;
		ages[3] = 71;
		ages[2] = 27;
		
		System.out.println(Arrays.toString(ages));
		
	}

}
