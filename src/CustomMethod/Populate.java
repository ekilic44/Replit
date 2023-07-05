package CustomMethod;

import java.util.Arrays;
import java.util.Scanner;



public class Populate {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
        in.close();
    }


    //CREATE YOUR METHOD
    public static void populate(int n) {
        int [] array=new int[n];

        for (int i = 0; i <array.length ; i++) {
array[i]=i+1;

        }
        System.out.println(Arrays.toString(array));

    }




}

