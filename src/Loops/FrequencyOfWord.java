package Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = " javA jaVa c# c# c#  JAVA java python python";
        String word = "java";
        int result = frequencyOfWord(str, word);
        System.out.println(result);


    }

    public static int frequencyOfWord(String str, String word) {
        int count = 0;
         while(str.contains(word)){
            str = str.toLowerCase().replaceFirst(word,"a");
            count++;



        }
        return count;
    }
}

