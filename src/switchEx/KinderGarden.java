package switchEx;

import java.util.Scanner;

public class KinderGarden {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        //WRITE YOUR CODE BELOW

        if (age < 3) {
            System.out.println("ineligible");
        } else if (age == 3 || age == 4) {
            System.out.println("preschool");
        } else if (age == 5) {
            System.out.println("kindergarten");
        } else if (age == 6 || age == 7 || age == 8 || age == 9 || age == 10) {
            System.out.println("elementary school");
        } else if (age == 11 || age == 12 || age == 13) {
            System.out.println("middle school");
        } else if (age == 14 || age == 15 || age == 16 || age == 17 || age == 18) {
            System.out.println("high school");
        } else if (age > 19) {
            System.out.println("College");

        }}}
