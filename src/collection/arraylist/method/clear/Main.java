package collection.arraylist.method.clear;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.clear();
        System.out.println(list);  // Output: []
    }
}
