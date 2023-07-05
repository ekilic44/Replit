package arrayList;

import java.util.ArrayList;

public class ArrayListWithLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("list = " + list);
      /*  for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }               */


        for (String each : list) {
            String element = each;
            System.out.println("Current element: " + element);
        }

    }
}