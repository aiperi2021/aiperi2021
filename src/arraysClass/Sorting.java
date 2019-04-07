package arraysClass;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		int ages [] = {34,23,6,24,78,89,55};
		System.out.println(Arrays.toString(ages));
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
		
		String [] cars = {"bmw", "amg", "mercedes", "toyota", "zenda", "lexus"};
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		
	}

}
