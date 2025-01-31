package collection.arraylist.method.trimToSize;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(100);
        list.add("Apple");
        list.add("Banana");
        list.trimToSize();  // Trims to the current size of 2
        System.out.println(list.size());  // Output: 2
    }
}
