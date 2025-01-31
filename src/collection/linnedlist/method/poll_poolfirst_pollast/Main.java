package collection.linnedlist.method.poll_poolfirst_pollast;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list.pollFirst());  // Output: Apple
        System.out.println(list.pollLast());   // Output: Cherry
        System.out.println(list);  // Output: [Banana]
    }
}
