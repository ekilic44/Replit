package CustomMethod;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        // loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            int n=nums[i];
            // initialize count to 0 for each element
            int count = 0;
            // loop through each element in the array
            for (int j = 0; j < nums.length; j++) {
                int m=nums[j];
                // if the current element equals the element being counted, increment count
                if (n == m) {
                    count++;
                }
            }
            // if the count of the current element is 1, it is unique, so print it
            if (count == 1) {
                System.out.println(n);
            }
        }
    }}
