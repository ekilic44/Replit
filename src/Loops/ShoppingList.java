package Loops;
import java.util.Scanner;
public class ShoppingList {
        public static void main(String[] args) {
            String itemName=" ";
            double price= 0, totalReceipt = 0;
            int quantity=0;
            char choice=' ';
            String shoppingList=" ";
            int counter=0;


            Scanner scan= new Scanner(System.in);
            while (true){
                counter++;
                System.out.println("Enter the name of item 1 "+ counter);
                itemName= scan.nextLine(); // Cheese
                System.out.println("Enter the price of the "+ itemName);
                price= scan.nextDouble();
                System.out.println("How many " +itemName+" will you buy?");
                quantity=scan.nextInt();
                double totalPriceOfThisItem= price * quantity;

                shoppingList+= itemName+ " x " +quantity+" - $"+totalPriceOfThisItem+"\n" ;

                totalReceipt+=totalPriceOfThisItem;

                System.out.println("Do you want to add more items to the shopping list?");
                String answer = scan.next();
                scan.nextLine();
                if (! (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes")) ) {
                    System.err.println("INVALID ENTRY");
                }
                if(answer.equalsIgnoreCase("no")){

                    System.out.println("SHOPPING LIST:\n"+shoppingList+"Total cost: $"+totalReceipt );
                    break;

                }
            }



    }


}
