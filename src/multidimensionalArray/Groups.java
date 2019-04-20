package multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Groups {
	
	public static void main(String[] args) {
//		String name = "Adam";
//		String [] n= new String[2];
//		n[0] = name;
//		String [][] nn = new String[2][];
//		nn[0] = n;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of groups:");
		int sizeOfGroup = input.nextInt();
		input.nextLine();
		String [][] groups = new String[sizeOfGroup][];
		for(int i = 0; i < groups.length; i++) {
			System.out.println("Please enter number of students for group " + (i+1));
			int memberNum = input.nextInt();
			input.nextLine();
//			String [] group = new String[memberNum];
			for(int j = 0; j < memberNum; j++) {
				System.out.println("Enter name " + (j+1) + ":");
				groups[i][j] = input.nextLine();
			}
//			groups[i] = group;
		}
		System.out.println(Arrays.deepToString(groups));
	}

}
