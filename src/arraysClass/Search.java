package arraysClass;

import java.util.Arrays;

public class Search {
	
	public static void main(String[] args) {
		int [] nums = {45,23,6,-3,66};
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 23) {
				System.out.println(i);
				break;
			}
		}
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		int result = Arrays.binarySearch(nums, 77);
		System.out.println(result);
//		-(5) - 1 => -6
		
		
	}

}
