package collection.arraylist.method.sizeof;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        System.out.println(list.indexOf("Apple"));  // Output: 0
    }
}

