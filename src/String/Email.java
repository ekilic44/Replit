package String;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW



        String first=  email.substring(0, email.lastIndexOf("_"));
        System.out.println("First name: " + first.substring(0,1).toUpperCase()+first.substring(1));


String last= email.substring(email.indexOf("_")+1, email.indexOf("@"));
        System.out.println("Last name: "+last.substring(0,1).toUpperCase()+ last.substring(1));

        String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Domain: "+ domain);

        scan.close();
    }
}
