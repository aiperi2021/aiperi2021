package methodOverloading;

public class Window {
	
	public static void main(String[] args) {
//		printArray(23,34,65,2,54,7,4,2);
		maxValue(-23,-12,-6,-345,-56);
		
	}
	
	public static void maxValue(int ...nums) {
		int max = nums[0];
		for(int i: nums) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("Max: " + max);
	}
	
	public static void printArray(int n , int ... nums) {
		for(int i: nums) {
			System.out.println(i);
		}
	}

}
