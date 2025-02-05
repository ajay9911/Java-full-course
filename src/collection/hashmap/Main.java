package collection.hashmap;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
//        map.put(3, "Cherry");
        map.put(3,"orange");
        map.put(100,"Guava");

        // Printing HashMap
        System.out.println(map); // {1=Apple, 2=Banana, 3=Cherry}
    }
}
