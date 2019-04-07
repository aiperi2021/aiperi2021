package arrayDataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {
	
	// step1: download the test.txt to your computer
	// step2: copy and paste it to your project
	// step3: Create a class Names and paste the code snippet to there
	

	public static void main(String[] args) throws FileNotFoundException {
		// print the names that has the length of 5
		// print all the names but empty lines
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
//			if(name.length() == 5) {
//				System.out.println(name);
//			}
			if(name.isEmpty()) {
				continue;
			}
			System.out.println(name);
		}
	}

}
