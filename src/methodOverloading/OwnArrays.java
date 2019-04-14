package methodOverloading;

public class OwnArrays {
	public static void main(String[] args) {
		String [] colors = {"Red", "Blue", "white", "yellow", "pink"};
		System.out.println(toString(colors));
	}
	
	public static String toString(String [] words) {
//		[ele1, ele2, ele3,]
		String result = "[";
		for(int i = 0; i < words.length; i++) {
			if(i == words.length - 1) {
				result += words[i] + "]";
			}else {
				result += words[i] + ", ";
			}
		}
		return result;
	}
	
	public static String toString(int [] nums) {
//		[ele1, ele2, ele3,]
		String result = "[";
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length - 1) {
				result += nums[i] + "]";
			}else {
				result += nums[i] + ", ";
			}
		}
		return result;
	}

}
