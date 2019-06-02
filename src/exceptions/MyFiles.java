package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFiles {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File file = new File("/Users/cybertekchicago-1/Desktop/cp.txt");

        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
        System.out.println(input.nextLine());
        Thread.sleep(2000);
        System.out.println("End of program");
    }
}
