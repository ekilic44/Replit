package String;

import java.util.Scanner;

public class indexOf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        if (word.length() % 2 == 0) {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        } else {
            System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));


        }
        scan.close();
    }
}

