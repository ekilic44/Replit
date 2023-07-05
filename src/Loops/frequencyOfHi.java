package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class frequencyOfHi {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String word ="hi";
        int count=0;

       /* while(str.contains(word)){
            str = str.replaceFirst(word,"");
            count++;

            }
        System.out.println(count);
        
        */
        for (char each : str.toCharArray()) {
            if((str.contains(word))){
                str = str.replaceFirst(word,"");
                count++;
            
        }
        
        }
        System.out.println(count);
scan.close();
    }}

