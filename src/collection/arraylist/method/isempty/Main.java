package collection.arraylist.method.isempty;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());  // Output: true
        list.add("Apple");
        System.out.println(list.isEmpty());  // Output: false
    }
}

