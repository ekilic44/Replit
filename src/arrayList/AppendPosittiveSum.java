package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosittiveSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
in.close();
    }

    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>list){
   
    {
        // Create a new ArrayList to store the positive numbers and sum
        ArrayList<Integer> result= new ArrayList<>();
        // Initialize the sum to 0
      int sum=0;
        // Iterate through each number in the input list
        for (Integer num : list) {


            // Check if the number is positive
           if (num>0){
                // Add the positive number to the result Arraylist
                result.add(num);
                // Add the positive number to the sum
               sum+=num;
            }
        }
        // Add the sum to the end of the result list
       result.add(sum);
        // Return the result list
        return result;

    }

}}