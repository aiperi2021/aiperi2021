package arrayDataDriven;

public class ToString {
	
	public static void main(String[] args) {
		int [] nums = {23,23,34,56,342,2};
		String result ="[";
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length-1) {
				result += nums[i] + "]";
			}else {
				result += nums[i] + ", ";
			}
		}
		System.out.println(result);
	}

}
