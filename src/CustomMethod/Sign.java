package CustomMethod;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);

    }

    public static void sign(int n) {
        //WRITE YOUR CODE BELOW
        if (n > 0) {
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negaive");

        }else {
            System.out.println("Zero");
    }

}
}

