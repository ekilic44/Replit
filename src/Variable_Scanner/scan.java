package Variable_Scanner;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        int price = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price += 200;
        }

        System.out.println("Select CPU type:");
        String CPU = scan.next();
        if (CPU.equals("i7")) {
            price += 350;

            System.out.println("Select RAM size:");
            int RAM = scan.nextInt();
            if (RAM == 8)
                price += 200;

            System.out.println("Select Storage Type and size");
            String storageType = scan.next();
            int storageSize = scan.nextInt();
            if (storageType.equals("SSD") && storageSize == 1000)
                price += 100;

            System.out.println("Select screen resolution:");
            String screenResolution = scan.next();
            if (screenResolution.equals("4K"))
                price += 200;

            System.out.println("Laptop price is: " + price +"$amount");
        }
scan.close();

    }
}
