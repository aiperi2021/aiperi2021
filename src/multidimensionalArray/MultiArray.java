package multidimensionalArray;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		int [][] nums = new int[2][];
		System.out.println(nums[0][0]);
//		int[][] n = getMultiArray(3,5);
//		for(int [] i: n) {
//			System.out.println(Arrays.toString(i));
//		}
//		highestSum(n);
//		maxValue(n);
//		
	}
	
	public static void highestSum(int [] [] nums) {
		// i --> index of inner arrays
		// j --> index of inner array's elements
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			int sum = 0; 
			for(int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
			if(sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(Arrays.toString(nums[index]));
	}
	
	
	

	public static void maxValue(int[][] nums) {
		int max = nums[0][0];
		// Smallest value that integer can hold
		// Integer.minValue
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] > max) {
					max = nums[i][j];
				}
			}
		}
		System.out.println("Max: " + max);
	}

}
