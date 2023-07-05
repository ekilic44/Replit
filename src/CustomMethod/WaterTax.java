package CustomMethod;

import java.util.Scanner;

public class WaterTax {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));

        
    }
    public static double waterTax(double units) {
        //WRITE YOUR CODE BELOW:

        double bill = 0;

        if (units < 50) {
            bill = units * 0.60;
        } else if (units>=50 && units<100){
           bill = units * 0.60;
        } else if (units>=100) {
            bill = (units * 0.60)+50;
            
        }else if (units>=100) {
            bill = (units * 0.60)+100;

        }
        return bill;
    }
}

