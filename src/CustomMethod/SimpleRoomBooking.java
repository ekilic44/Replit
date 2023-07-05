package CustomMethod;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // WRITE YOUR CODE BELOW:
        if ((isAvailable==false)||(year != 2018 ||month==7 && ( day >=1 & day <=8))) return false;
        
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
in.close();
    }

}

