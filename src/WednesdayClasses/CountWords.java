package WednesdayClasses;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        countWords();
    }

    public static void countWords(){

        System.out.println("Please enter a sentence to be analyzed: ");

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine(); //Today is a great day

        String [] sentenceArr = sentence.split(" "); //{"Today", "is", "a", "great", "day"}

        System.out.println("Words in this sentence are as followed: " + Arrays.toString(sentenceArr));

        System.out.println("The number of words in this sentence is:" + sentenceArr.length);




    }
}
