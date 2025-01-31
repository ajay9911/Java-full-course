package collection.linnedlist.method.addfirst_addlast;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.addFirst("Apple");
        list.addLast("Cherry");
        System.out.println(list);  // Output: [Apple, Banana, Cherry]
    }
}
