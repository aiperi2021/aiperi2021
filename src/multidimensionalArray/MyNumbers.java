package multidimensionalArray;

public class MyNumbers {

	public static void main(String[] args) {
		int [][] nums = { {23,34,45,56,67}, {11,22,33,44,55}, {3,2,1,4,6}, {123,234,345,567,768}};
//		Part II
//		Print out the maximum sum value that one inner array gives
		int maximum = 0;
		for(int [] n: nums) {
			int sum = 0;
			for(int i: n) {
				sum += i;
			}
			if(sum > maximum) {
				maximum = sum;
			}
		}
		System.out.println(maximum);
	}
}



