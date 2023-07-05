package switchEx;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = scan.nextLine();
        int value = 0, giftCard = 100;


        if (item.equals("Blanket") || item.equals("Charger") || item.equals("Hat") || item.equals("Headphones") ||
                item.equals("Laptop") || item.equals("Pants") || item.equals("Smartphone") || item.equals("Socks")
                || item.equals("USB cable") || item.equals("Pillow")) {

            switch (item) {  // item is written in String form and case are in the same form too.
                case "Blanket":
                    value = 60;
                    break;
                case "Charger":

                    value = 5;
                    break;
                case "Hat":

                    value = 25;
                    break;
                case "Headphones":

                    value = 30;
                    break;
                case "Laptop":

                    value = 200;
                    break;
                case "Pants":

                    value = 50;
                    break;
                case "Pillow":

                    value = 40;
                    break;
                case "Smartphone":

                    value = 1000;
                    break;
                case "Socks":

                    value = 5;
                    break;
                case "USB cable":

                    value = 10;
                    break;

            }

            int balance = giftCard - value;

            if (balance > 0) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            } else {
                System.out.println("Sorry, not enough funds on your gift card");
            }
        } else {
            System.out.println("Sorry, that is an invalid item");
        }


      String a="Alice",
        b="Malice";
       String c= a.concat(b);
        System.out.println(c);
scan.close();
    }
}

