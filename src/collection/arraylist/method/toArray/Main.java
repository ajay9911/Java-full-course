package collection.arraylist.method.toArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.println(obj);  // Output: Apple, Banana
        }
    }
}
