package collection.hashset.method;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Create a HashSet
        Set<String> fruits = new HashSet<>();

        // 2. Add elements to the HashSet
        fruits.add("Apple");   // Adds "Apple" to the set
        fruits.add("Banana");  // Adds "Banana" to the set
        fruits.add("Mango");   // Adds "Mango" to the set
        fruits.add("Orange");  // Adds "Orange" to the set
        fruits.add("Apple");   // Duplicate, will not be added

        // 3. Check if element exists using contains()
        boolean hasBanana = fruits.contains("Banana");  // Returns true if "Banana" is in the set
        System.out.println("Contains Banana: " + hasBanana);

        // 4. Remove an element using remove()
        fruits.remove("Mango");   // Removes "Mango" from the set
        System.out.println("After removing Mango: " + fruits);

        // 5. Size of the HashSet using size()
        System.out.println("Size of HashSet: " + fruits.size());   // Returns the number of elements in the set

        // 6. Check if the HashSet is empty using isEmpty()
        boolean isEmpty = fruits.isEmpty();   // Returns true if the set is empty
        System.out.println("Is HashSet empty? " + isEmpty);

        // 7. Clear the entire HashSet using clear()
        fruits.clear();   // Removes all elements from the set
        System.out.println("After clearing HashSet: " + fruits);

        // 8. Check if the HashSet is empty after clearing
        System.out.println("Is HashSet empty after clearing? " + fruits.isEmpty());

        // 9. Add elements again for further demonstration
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 10. Add all elements from another collection using addAll()
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Peach");
        moreFruits.add("Grapes");
        fruits.addAll(moreFruits);   // Adds all elements from another set

        System.out.println("HashSet after addAll: " + fruits);

        // 11. Remove all elements that are in another collection using removeAll()
        Set<String> fruitsToRemove = new HashSet<>();
        fruitsToRemove.add("Peach");
        fruits.removeAll(fruitsToRemove);  // Removes "Peach" from fruits

        System.out.println("After removing 'Peach': " + fruits);

        // 12. Retain only the elements that are in another collection using retainAll()
        Set<String> fruitsToRetain = new HashSet<>();
        fruitsToRetain.add("Banana");
        fruits.retainAll(fruitsToRetain);  // Retains only "Banana"

        System.out.println("After retainAll with Banana: " + fruits);

        // 13. Iterate over the HashSet using iterator()
        Iterator<String> iterator = fruits.iterator();
        System.out.println("Iterating over HashSet using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. Convert HashSet to an array using toArray()
        Object[] fruitsArray = fruits.toArray();
        System.out.println("Array representation of HashSet:");
        for (Object fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
