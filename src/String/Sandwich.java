package String;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        scan.close();




        int start = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (str.replaceFirst("bread", " ").contains("bread")) {

            System.out.println(str.substring(start + 5, last));

        } else {
            System.out.println("nothing");
        }
    }
}
