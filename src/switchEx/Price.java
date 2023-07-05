package switchEx;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int price = 60;
        String answer=" ";

        switch (price) {
                case 60:
                    System.out.println("Hello, which item would you like? ");
                   answer="Hat";
                    System.out.println("Thank you for your purchase!");
                break;
            case 50:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("invalid Number:))");


                scan.close();   }
    }
}
