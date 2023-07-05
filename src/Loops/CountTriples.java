package Loops;



public class CountTriples {

        public static void main(String[] args) {
            String str = "aaabbbccc";
                        //012345678
            int count = 0;

            for (int i = 0; i < str.length() -2; i++) {
                //System.out.println(str.charAt(i));   // a  a   a   b   b   b    c     c
                //System.out.println(str.charAt(i)+1); // 98 98  98  99  99  99  100  100
               //System.out.println(str.charAt(i));     // a  a   a   b   b     b    c      c
               //System.out.println(str.charAt(i)+2);    // 99 99  99  100  100  100  101    101

                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                    count++;
                }
            }

            System.out.println("Number of triples in the string: " + count);


        }
    }
