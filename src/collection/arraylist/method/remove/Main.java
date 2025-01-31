package collection.arraylist.method.remove;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Banana");  // Remove by element
        System.out.println(list);  // Output: [Apple]

        list.add("Banana");
        list.remove(0);  // Remove by index
        System.out.println(list);  // Output: [Banana]
    }
}
