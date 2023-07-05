package Loops;

import java.util.Scanner;

public class javaandpython {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String java = "java".toLowerCase();
        String python = "python".toLowerCase();
        str=str.toLowerCase();
        int occurance = 0;
        int moccurance = 0;
        while (str.contains(python)) {
            str = str.replaceFirst(python, " ");
            occurance++;
        }
        while (str.contains(java)) {
            str = str.replaceFirst(java, " ");
            moccurance++;
        }
        if (occurance == moccurance) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}


