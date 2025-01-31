package collection.linnedlist.method.iterator;

import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // Output: Apple, Banana
        }
    }
}

