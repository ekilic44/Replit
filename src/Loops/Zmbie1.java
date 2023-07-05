package Loops;

import java.util.Scanner;

public class Zmbie1 {
    public static void main(String[] args) {

//DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int dayscount = 0;


        for (int i = inhabitants; i > 0; i /= 2) {
            dayscount++;


            System.out.println("Day "+dayscount++ +" ["+ i +"]");


        }
        System.out.println("---- EXTINCT ----");
            scan.close();
        }


    }


