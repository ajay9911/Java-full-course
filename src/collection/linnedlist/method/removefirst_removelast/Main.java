package collection.linnedlist.method.removefirst_removelast;

import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.removeFirst();  // Removes "Apple"
        list.removeLast();   // Removes "Cherry"

        System.out.println(list);  // Output: [Banana]
    }
}
