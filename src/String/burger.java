package String;

import java.util.Scanner;

public class burger {

    public static void main(String[] args) {

    //DO NOT TOUCH THESE LINE/LINES.
                Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:
        double burger= 12.50;
        double chicken= 9.75;


if (order.equals("burger")) {
    System.out.println("Your total is $" + burger);
}
if(order.equals("chicken")){
    System.out.println("Your total is $" + chicken);
}
    }
}