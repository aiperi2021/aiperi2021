package WednesdayRecap;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysMay15 {
	
	public static void main(String [] args) {
		
		//						0					1				2				3
		int [][] mdArray = {{22,33,11,10,12},{12,15,55,44,22},{50,10,20,20,15},{43,44,54,43,32}};
		
		printArray(mdArray, 2,2);
		
//		for(int row=0; row<mdArray.length; row++) {
//			
//			for(int col=0; col<mdArray[row].length; col++) {
//				
//				System.out.print(mdArray[row][col] + "\t");
//				
//			}
//			
//			System.out.println("");
//			
//		}
		
	}
	
	public static void printArray(int [][] mdArr, int row, int col) {
		
		System.out.println("The element at the row:" + row + " , colum: " + col + " is : " + mdArr[row][col]);
		
	}

}

		
//		
//		int [][] table = {  //01 2 3
//							{1,2,3,4}, //row 0
//							{5,6,7,8}, //row 1
//							{9,10,11,12} //row 2
//						};
//		
//		System.out.println(table[2][3]);

//		System.out.println("Welcome to DIVIDE MY ARRAY!");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a number that will be the size of your array: ");
//		
//		int size = scan.nextInt();
//		
//		int [] ourArray = new int [size];
//		
//		System.out.println("Enter numbers that will be elements of your array:");
//		
//		for(int i = 0; i<ourArray.length; i++) {
//			
//			ourArray[i] = scan.nextInt();
//			
//		}
//		
//		System.out.println("length of array" + ourArray.length);
//		System.out.println("The string value of your array is: " + Arrays.toString(ourArray));
//		
//		int [] firstHalf = Arrays.copyOfRange(ourArray, 0, ourArray.length/2);
//		int [] secondHalf = Arrays.copyOfRange(ourArray, ourArray.length/2, ourArray.length);
//		
//		System.out.println("The first half of your array is:" + Arrays.toString(firstHalf));
//		System.out.println("The second half of your array is: " + Arrays.toString(secondHalf));
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String [] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
//		
//		Arrays.sort(groceryList);
//		
//		System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
//		System.out.println("Index number if orange is: " + Arrays.binarySearch(groceryList, "pinapple"));
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int [] grades = {15, -25, 33, 35, 66, 44, 78, 95, 98, 1, 500};
//		
//		int maxValue = grades[0];
//		int minValue = grades[0];
//		
//		for(int i=0; i<grades.length; i++) {
//			
//			if(maxValue <grades[i]) { //grades[1]
//				maxValue  =grades [i];
//			}
//			if(minValue > grades[i]) {
//				minValue = grades[i];
//			}
//			
//		}
//		
//		System.out.println("Max value: "  + maxValue);
//		System.out.println("Min value:" + minValue);
		
		
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for (int i: grades) {
//			if (i <= min) {
//				min = i;
//			}
//			if (i >= max) {
//				max = i;
//			}
//		}
//			System.out.println("Max " + max + "\nMin " + min);
//		
		
//		Arrays.sort(grades);
//		
//		System.out.println("Min grade is:" + grades[0]);
//		System.out.println("Max grades is:" + grades[grades.length-1]);
//		
		
		
		
		
		
		
		
		
		
		
//		String [] shows = {"Game of Thrones", "Friends", "Doctor Who", 
//				"Prison Break", "Grey's Anatomy"};
//		
//		Arrays.sort(shows);
//		
//		System.out.println("Sorted list of shows: ");
//		for(int i=0; i<shows.length; i++ ) {
//			
//			System.out.println("#" + i + " " + shows[i]);
//			
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
//		String [] carBrands = {"mercedes", "bmw","toyota","ferrari"};
//		
//		for(String cars: carBrands) {
//			if(cars == ("mercedes")) {
//				System.out.println(cars + ": Luxury - Comfort");
//				
//			}else if(cars == ("bmw")) {
//				System.out.println(cars + ": Luxury - Sport");
//
//			}else if(cars== ("toyota")) {
//				System.out.println(cars + ": Reliable - Cheap");
//
//			}else {
//				System.out.println(cars + ": Super car - Super expensive");
//
//			}
//		}
		
		
