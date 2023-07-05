package CustomMethod;

import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        if (main.contains(coverMe)) {
            main = main.replace(coverMe, ("[" + coverMe + "]"));
        } else {
            main = main.replace(main, ("[" + main + "]"));
        }
        return main;
    }}