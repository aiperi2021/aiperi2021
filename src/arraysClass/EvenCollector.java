package arraysClass;

import java.util.Arrays;

public class EvenCollector {
	
	public static void main(String[] args) {
		int [] numbers = {1,2,-3,4,-34,55,78,90,33,10};
		int counter = 0;
		// Loop through numbers array and count even numbers
		for(int num: numbers) {
			if(num % 2 == 0) {
				counter++;
			}
		}
		// Once we find even numbers we are creating array called evens
		System.out.println(counter);
		int [] evens = new int[counter];
		int i = 0;
		// Loop through numbers again and find even number to store them
		// into array evens
		for(int num: numbers) {
			if(num % 2 == 0) {
				evens[i] = num;
				i++;
			}
		}
		System.out.println(Arrays.toString(evens));
	}

}
