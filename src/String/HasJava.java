package String;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:



        if(word.contains("java")&&(word.indexOf("java")==0||word.indexOf("java")==1)){
            exists=true;
        }
        System.out.println(exists);




    }
}

