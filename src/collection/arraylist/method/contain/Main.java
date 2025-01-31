package collection.arraylist.method.contain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.contains("Apple"));  // Output: true
        System.out.println(list.contains("Orange"));  // Output: false
    }
}

