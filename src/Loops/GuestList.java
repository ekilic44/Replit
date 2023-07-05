package Loops;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list= "";
        while (true) {
            System.out.println("Please enter the guest's name:");
           String name = scan.next() +", ";
           list+=name;


            System.out.println("Do you want to enter another guest's name?");
            String answer = scan.next();
            if (! (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes")) ) {
                System.err.println("INVALID ENTRY");
                System.exit(0);
            }

            if(answer.equalsIgnoreCase("no")){

list=list.substring(0, list.length()-2);
                System.out.println("Guests' list: "+list);
                break;


            }
        }


    }
}