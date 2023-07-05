package CustomMethod;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

    public static String profit(int buyPrice, int sellPrice) {
        //WRITE YOUR CODE BELOW
        String result=" ";
if (buyPrice<sellPrice){
    return "profit";
} else if (buyPrice>sellPrice) {
return   "loss";
} else if (buyPrice==sellPrice) {
    return "no loss";
}
return result;
    }
}
