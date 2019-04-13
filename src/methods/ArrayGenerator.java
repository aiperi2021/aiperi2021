package methods;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
	
	public static void main(String[] args) {
		int [] numbers = getArray(10, 100);
		System.out.println(Arrays.toString(numbers));
		System.out.println(evenCount(numbers));
	}
	
	public static int evenCount(int [] arr) {
		int count = 0;
		for(int i: arr) {
			if(i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int [] getArray(int size, int bound) {
		int [] nums = new int[size];
		Random random = new Random();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(bound);
		}
		return nums;
	}
	
	
}
