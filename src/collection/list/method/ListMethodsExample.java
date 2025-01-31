package collection.list.method;

import java.util.*;

public class ListMethodsExample {
    public static void main(String[] args) {
        // Creating a List using ArrayList
        List<String> list = new ArrayList<>();

        // 1. Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");
        list.add(1, "Watermelon");  // Adding at a specific index

        // 2. Get elements by index
        System.out.println("Element at index 2: " + list.get(2));  // Output: Orange

        // 3. Set (replace) element at specific index
        list.set(3, "Pineapple");
        System.out.println("Element at index 3 after update: " + list.get(3));  // Output: Pineapple

        // 4. Remove element by index
        list.remove(4);  // Removes "Grapes" (element at index 4)
        System.out.println("List after removing element at index 4: " + list);

        // 5. Remove element by object
        list.remove("Apple");  // Removes the first occurrence of "Apple"
        System.out.println("List after removing 'Apple': " + list);

        // 6. Check if the list contains a specific element
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));  // Output: true

        // 7. Get the size of the list
        System.out.println("Size of the list: " + list.size());  // Output: 4

        // 8. Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());  // Output: false

        // 9. Find the index of an element
        System.out.println("Index of 'Orange': " + list.indexOf("Orange"));  // Output: 1

        // 10. Find the last index of an element
        list.add("Orange");
        System.out.println("Last index of 'Orange': " + list.lastIndexOf("Orange"));  // Output: 4

        // 11. Clear all elements from the list
        list.clear();
        System.out.println("List after clearing: " + list);  // Output: []

        // 12. Add all elements from another collection (e.g., another list)
        list.addAll(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("List after addAll: " + list);

        // 13. Retain only common elements with another collection
        List<String> retainList = new ArrayList<>(Arrays.asList("Banana", "Cherry"));
        list.retainAll(retainList);
        System.out.println("List after retainAll: " + list);  // Output: [Banana, Cherry]

        // 14. Remove all elements that are present in another collection
        List<String> removeList = new ArrayList<>(Arrays.asList("Banana"));
        list.removeAll(removeList);
        System.out.println("List after removeAll: " + list);  // Output: [Cherry]

        // 15. Convert list to array
        Object[] array = list.toArray();
        System.out.println("Array representation: " + Arrays.toString(array));  // Output: [Cherry]

        // 16. Iterate over the list using a for-each loop
        System.out.println("Iterating through list using for-each:");
        for (String item : list) {
            System.out.println(item);
        }

        // 17. Iterate over the list using an iterator
        System.out.println("Iterating through list using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 18. Iterate using ListIterator (forward and backward)
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Iterating forward with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Iterating backward with ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
