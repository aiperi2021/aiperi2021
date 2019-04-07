package arraysClass;

import java.util.Arrays;

public class IncrementArrayValues {
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8,9};
		for(int num: nums) {
			System.out.print(num + " ");
		}
		// Double the even value, triple the odd values
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				nums[i] = nums[i] * 2;
			}else {
				nums[i] = nums[i] * 3;
			}
			
		}
		System.out.println();
		// Print values with space separated
//		System.out.println(Arrays.toString(nums));
		for(int num: nums) {
			System.out.print(num + " ");
		}
		
	}

}
