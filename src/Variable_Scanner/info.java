package Variable_Scanner;

import java.util.Scanner;

public class info {
    public static void main(String[] args) {

        //Enter your code here
        Scanner scan = new Scanner(System.in);

        String firstName, lastName, email, street, state, city = " ";
        int age, zipCode=0;
        long workPhoneNumber ,personalPhoneNumber=0;
        double height, weight=0;
        boolean married=true;


        System.out.print("Welcome to the patient portal! \n Please enter your personal information \n Enter your first name");
        firstName = scan.next();
        System.out.print("Enter your last name");
        lastName = scan.next();
        System.out.println();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.print("Enter your city");
        city=scan.next();
        System.out.print("Enter your state");
        state = scan.next();


        System.out.print("Enter your zip code");
        zipCode= scan.nextInt();
        System.out.println();

        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber= scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height=scan.nextDouble();

        System.out.println("Enter your weight");
        weight=scan.nextDouble();

        System.out.println("Are you married?");
        married=true;


        scan.close();
    }
}

