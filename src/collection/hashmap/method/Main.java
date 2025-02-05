package collection.hashmap.method;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Put Key-Value Pairs
        map.put(1, "Apple");   // Insert a key-value pair (1 -> "Apple")
        map.put(2, "Banana");  // Insert a key-value pair (2 -> "Banana")
        map.put(3, "Cherry");  // Insert a key-value pair (3 -> "Cherry")

        // 3. Display the HashMap
        System.out.println("Initial HashMap: " + map);

        // 4. Get a Value Using Key
        String value1 = map.get(2);  // Retrieve value for key 2 (Expected: "Banana")
        System.out.println("Value for key 2: " + value1);

        // 5. Check if a Key Exists
        boolean containsKey = map.containsKey(3);  // Check if key 3 exists
        System.out.println("Contains key 3: " + containsKey);  // Expected: true

        // 6. Check if a Value Exists
        boolean containsValue = map.containsValue("Apple");  // Check if "Apple" exists as value
        System.out.println("Contains value 'Apple': " + containsValue);  // Expected: true

        // 7. Remove a Key-Value Pair
        map.remove(1);  // Remove the key-value pair with key 1
        System.out.println("HashMap after removing key 1: " + map);

        // 8. Update a Value for an Existing Key
        map.put(2, "Blueberry");  // Update value for key 2 to "Blueberry"
        System.out.println("HashMap after updating key 2: " + map);

        // 9. Get the Size of the HashMap
        int size = map.size();  // Get the number of key-value pairs in the map
        System.out.println("Size of HashMap: " + size);  // Expected: 2 (keys 2 and 3)

        // 10. Check if HashMap is Empty
        boolean isEmpty = map.isEmpty();  // Check if the map is empty
        System.out.println("Is HashMap empty? " + isEmpty);  // Expected: false

        // 11. Get All Keys Using keySet()
        System.out.println("Keys in HashMap: " + map.keySet());  // Expected: [2, 3]

        // 12. Get All Values Using values()
        System.out.println("Values in HashMap: " + map.values());  // Expected: [Blueberry, Cherry]

        // 13. Get Key-Value Pairs Using entrySet()
        System.out.println("Key-Value Pairs in HashMap:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Output will be:
        // 2 -> Blueberry
        // 3 -> Cherry

        // 14. Replace Value for a Key
        map.replace(3, "Date");  // Replace value for key 3 with "Date"
        System.out.println("HashMap after replacing key 3's value: " + map);

        // 15. Check if the Map Contains a Key and Replace its Value (replace)
        map.replace(2, "Blueberry", "Grapes");  // If value is "Blueberry", replace with "Grapes"
        System.out.println("HashMap after conditional replacement: " + map);

        // 16. Clear the HashMap (removes all entries)
        map.clear();  // Clear all entries in the map
        System.out.println("HashMap after clear(): " + map);  // Expected: {}

        // 17. Re-inserting items after clear
        map.put(10, "Fig");
        map.put(20, "Grapes");
        System.out.println("Reinserted HashMap: " + map);
    }
}
