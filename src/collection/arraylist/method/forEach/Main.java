package collection.arraylist.method.forEach;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.forEach(item -> System.out.println(item));  // Output: Apple, Banana
    }
}
