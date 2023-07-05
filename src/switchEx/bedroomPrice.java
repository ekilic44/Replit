package switchEx;

import java.util.Scanner;

public class bedroomPrice {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        //WRITE YOUR CODE HERE:

        if(numberOfBedrooms==1) {
            System.out.println("One Bedroom Selected \n Starting Price: 1100");
        } else if (numberOfBedrooms ==2) {
            System.out.println("Two Bedroom Selected \n Starting Price: 1850");}
        else if (numberOfBedrooms ==3) {
            System.out.println("Three Bedroom Selected \n Starting Price: 2250");
        }else {
            System.out.println("Sorry, we do not offer that many bedrooms");}
scan.close();
        }

        }


