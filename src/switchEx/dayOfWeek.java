package switchEx;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE BELOW
switch (day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Not a valid day");
        break;
}

    }

}
