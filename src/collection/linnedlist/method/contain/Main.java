package collection.linnedlist.method.contain;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.contains("Apple"));  // Output: true
        System.out.println(list.contains("Orange")); // Output: false
    }
}
