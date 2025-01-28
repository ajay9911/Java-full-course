package map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> maps=new HashMap<>();
        maps.put(1,"Ajay");
        maps.put(2,"Raj");
        maps.put(3,"Vijay");

        System.out.println(maps.size());
        System.out.println(maps);
        System.out.println(maps.get(1));

        maps.remove(1);
        System.out.println("After Remove:"+maps);

        System.out.println("Contain Key:"+maps.containsKey(2));
        System.out.println("Contain Value"+maps.containsValue("Raj"));
        System.out.println("Keys: " + maps.keySet());
        System.out.println("Values: " + maps.values());
    }

}
