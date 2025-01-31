package collection.linnedlist.method.clear;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.clear();
        System.out.println(list);  // Output: []
    }
}
