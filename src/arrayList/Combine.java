package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Combine {
    public static ArrayList<String> combine(String[] r1, String[] r2){

        // your code here
        ArrayList<String> combined= new ArrayList<>();
        combined.addAll(Arrays.asList(r1) );
        combined.addAll(Arrays.asList(r2));
return combined;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the size of the strs array.");
        String [] strs = new String[in.nextInt()];
        System.out.println("input elements of strs");
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println("input the size of the strs2 array.");
        String [] strs2 = new String[in.nextInt()];
        System.out.println("input elements of strs2");
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs,strs2));
        in.close();
    }

}

