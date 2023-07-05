package String;

public class removespace {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        char ch[]= str.toCharArray();

        String str1="";
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!=' ' ){
                str1+=ch[i];

        }



        }
        System.out.println(str1);
    }
}
/*
String str1="";
        for (char each : ch) {
            if (each!=' '){
            str1+=each;}



        }
        System.out.println(str1);
 */