package arrays;

import java.util.Arrays;

public class StorePrices {

	public static void main(String[] args) {
		double x = 65.4;
		double [] prices = {45.99, 23.5, 11.50, 33.33, x};
		System.out.println(Arrays.toString(prices));
		x = 112.89;
		System.out.println(x);
		System.out.println(Arrays.toString(prices));
		// length --> this returns an integer that is a size of array.
		System.out.println(prices.length);
		int [] numbers = {34,23,5};
		
		
	}
}
