package collection.arraylist.method.set;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.set(1, "Orange");
        System.out.println(list);  // Output: [Apple, Orange]
    }
}

