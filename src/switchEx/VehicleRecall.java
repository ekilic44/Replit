package switchEx;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE BELOW:
if (vehicleYear==1995 || vehicleYear==1996 || vehicleYear ==1997 ||vehicleYear<=1998 ||
        vehicleYear==2001 || vehicleYear==2004 || vehicleYear== 2005
||vehicleYear==2006 ||vehicleYear==2015 || vehicleYear==2016 || vehicleYear==2017) {
    System.out.println("Your vehicle needs to be recalled!");

}
      else  {
            System.out.println("Your vehicle is fine, enjoy!");

        }



    }
}