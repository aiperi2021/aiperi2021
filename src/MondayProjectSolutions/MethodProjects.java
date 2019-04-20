package MondayProjectSolutions;

import java.util.Arrays;

public class MethodProjects {

	public static void main(String[] args) {
		
	}

	public static int[] extractNum(String str) {
		// str = afjadlkfj($)#234dsfs 
		
		// find out how many element
		String temp="";
		for(int i=0; i<str.length(); i++) {
			
			// Character.isDigit('1') => true if not then return false 
			if(Character.isDigit(str.charAt(i))) {
				temp+=str.charAt(i);
			}
		}
		
		int[] nums = new int[temp.length()];
		
		for(int i=0; i<temp.length(); i++) {
			nums[i]=Integer.parseInt(""+temp.charAt(i));
		}
		
		return nums;
	}
	
	public static boolean isAnagram(String word1, String word2) {
		
		word1 = word1.trim().toLowerCase().replace(" ", "");
		word2 = word2.trim().toLowerCase().replace(" ", "");
		
		if(word1.length()!=word2.length()) return false;
		
		String[] word1Arr = word1.split("");
		String[] word2Arr = word2.split("");
		
		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);
		
		//boolean b = Arrays.equals(word1Arr, word2Arr);
		
		for(int i=0; i<word1Arr.length; i++) {
			if(!word1Arr[i].equals(word2Arr[i])) return false;
		}
		
		return true;
	}
	
	public static int secondLargestNum(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int secondMax =Integer.MIN_VALUE;
		// [1, 2, 3, 4, 34, 12, 11]
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				secondMax = max;
				max=arr[i];
			} else if(arr[i]>secondMax&& arr[i]!=max) {
				secondMax = arr[i];
			}
		
			
		}
		
		return secondMax;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
