package Loops;

public class CountSubStringsMethod {
    public static void main(String[] args) {
        String str= "javaaa and javvva JAVA Java";
       String sub= "java";
        System.out.println(countSubstrings(str, sub));


    }
    public static int countSubstrings(String str, String sub) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.contains(sub)) {
              str= str.toLowerCase().replaceFirst(sub,"");
                    count++;
                }
            }

        return count;
    }}
   /* public static int countSubstrings(String str, String sub) {
        int count = 0;
        while (str.contains(sub)) {
            str = str.replaceFirst(sub, "");
            count++;
        }
        return count;
    }

    */

