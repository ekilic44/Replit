package String;

import java.util.Scanner;

public class PrefixContain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW

        String str2= str.substring(0,n);
        String str3= str.substring(n)+1;
        boolean contain= false;
        if (str3.contains(str2)){
            contain=true;
        }
         System.out.println(contain);

         /*


        String prefix=str.substring(0,n);
        String rest=str.substring(1,str.length());

        boolean isOk=false;

        if(rest.contains(prefix))
            isOk=true;

        System.out.println(isOk);

          */



    }
}

