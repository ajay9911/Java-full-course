package collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> maps=new LinkedHashMap<>();
        maps.put("Ajay",101);
        maps.put("Vijay",102);
        maps.put("Raj",103);
        System.out.println(maps);


        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
