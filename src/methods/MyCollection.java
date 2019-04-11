package methods;

import java.util.Arrays;

public class MyCollection {
	
	public static void main(String[] args) {
		int [] nums = {23,53,2,-4,23,-45,-785,1};
		//printNegativeNums(nums);
		System.out.println(Arrays.toString(nums));
		replaceNegative(nums, 100);
	}
	
	public static void replaceNegative(int [] nums, int replacement) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0) {
				nums[i] = replacement;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	
	public static void printNegativeNums(int [] numbers) {
		for(int num: numbers) {
			if(num < 0) {
				System.out.println(num);
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
