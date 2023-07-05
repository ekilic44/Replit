package Loops;

import java.util.Scanner;

public class nnanew {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int counter=0;

        double totalReceipt = 0;

        String shoppingList="";

        while(true){
            counter++;

            System.out.println("Enter the name of item "+(counter));
            String itemName=scan.nextLine();

            System.out.println("Enter the price of the "+itemName);
            double price=scan.nextDouble();

            System.out.println("How many "+ itemName+" will you buy?");
            int quantity=scan.nextInt();

            double totalPriceOfThisItem= price * quantity;

            shoppingList+=itemName+ " x " +quantity+" - $"+totalPriceOfThisItem+"\n" ;

            totalReceipt+=totalPriceOfThisItem;

            scan.nextLine();

            System.out.println("Do you want to add more items to the shopping list?");

            String yesOrNo=scan.nextLine();

            if(yesOrNo.equalsIgnoreCase("no")){

                System.out.println("SHOPPING LIST:\n"+shoppingList+"Total cost: $"+totalReceipt );
                break;
            }

        }
    }
}
