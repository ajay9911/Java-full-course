package collection.arraylist.method.sublist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println(list.subList(1, 3));  // Output: [Banana, Cherry]
    }
}
