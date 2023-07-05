package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the size of the list from the user input
        System.out.println("the size of the list");
        int size = in.nextInt();

        // Read the string to search for from the user input
        System.out.println("to search");
        String find = in.next();

        // Consume the remaining newline character from the input
        System.out.println("remaining new line");
        in.nextLine();

        // Create an ArrayList to hold the input strings
        ArrayList<String> list = new ArrayList<>();

        // Read each string from the user input and add it to the ArrayList
        System.out.println("Each String");
        for (int i = 0; i < size; i++) {
            list.add(in.nextLine());
        }
        // Call the search method to search for the string in the list // Print the result to the console
        System.out.println(search(list, find));


in.close();
    }


    public static String search(ArrayList<String> strs, String find) {

        // Iterate over each string in the ArrayList
        for (String each : strs) {
            // Check if the string contains the search string
            if (each.contains(find)) {
                // If it does, return the string
                return each;
            }
        }
        // If no match is found, return "search failed"
        return "search failed";
    }
}






