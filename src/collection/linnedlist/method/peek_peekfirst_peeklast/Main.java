package collection.linnedlist.method.peek_peekfirst_peeklast;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list.peekFirst());  // Output: Apple
        System.out.println(list.peekLast());   // Output: Cherry
    }
}
