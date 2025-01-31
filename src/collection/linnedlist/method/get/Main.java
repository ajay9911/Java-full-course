package collection.linnedlist.method.get;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list.get(1));  // Output: Banana
    }
}
