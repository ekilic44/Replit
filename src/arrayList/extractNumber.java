package arrayList;


import java.util.Arrays;
import java.util.Scanner;

public class extractNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(extractNum(scan.next() + ','));
scan.close();
    }

    public static String extractNum(String s) {
        // Convert the input string to a char array
        char[] array = s.toCharArray();

        // Create an empty string to hold the extracted digits
        String result = "";

        // Loop through each character in the char array
        for (char each : array) {
            // If the character is a digit, add it to the result string with a space after it
            if (Character.isDigit(each)) {
                result += each + " ";
            }
        }

        // Remove the last space from the result string and return it
        return result.trim();
    }
}
