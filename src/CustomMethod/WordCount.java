package CustomMethod;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

    public static int wordCount(String words) {
        int count=0;
        String [] array= words.split(" ");
        for (int i = 0; i < array.length; i++) {
            count++;

        }


        return count;
    }


}
