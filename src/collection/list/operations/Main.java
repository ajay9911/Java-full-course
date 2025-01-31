package collection.list.operations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList to demonstrate all List operations
        List<String> list = new ArrayList<>();

        // 1. Adding Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add(1, "Mango");  // Insert Mango at index 1
        List<String> newFruits = new ArrayList<>(Arrays.asList("Grapes", "Peach"));
        list.addAll(newFruits);  // Adding all elements from newFruits

        // 2. Retrieving Elements
        System.out.println("Element at index 2: " + list.get(2));  // Orange
        System.out.println("First occurrence of 'Mango': " + list.indexOf("Mango"));
        System.out.println("Last occurrence of 'Apple': " + list.lastIndexOf("Apple"));
        System.out.println("Sublist (1, 4): " + list.subList(1, 4));  // [Mango, Orange, Banana]

        // 3. Updating Elements
        list.set(3, "Strawberry");  // Replacing "Orange" with "Strawberry"
        System.out.println("Updated List: " + list);

        // 4. Removing Elements
        list.remove(4);  // Removes element at index 4 ("Banana")
        list.remove("Grapes");  // Removes the first occurrence of "Grapes"
        list.removeAll(newFruits);  // Removes all elements in newFruits list
        list.clear();  // Clears all elements in the list

        // 5. Checking List Properties
        list.add("Apple");
        list.add("Banana");
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Contains 'Apple': " + list.contains("Apple"));
        System.out.println("Contains all newFruits: " + list.containsAll(newFruits));

        // 6. Converting to Array
        Object[] array = list.toArray();  // Converts list to array
        System.out.println("Array: " + Arrays.toString(array));

        // 7. Iterating over the List
        System.out.println("Iterating over list using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 8. Checking for Elements
        System.out.println("List equals newFruits list? " + list.equals(newFruits));
        System.out.println("Hash code of the list: " + list.hashCode());
        System.out.println("String representation of the list: " + list.toString());

        // 9. Bulk Operations
        List<String> anotherList = new ArrayList<>(Arrays.asList("Orange", "Peach"));
        list.addAll(anotherList);  // Add all elements from another list
        System.out.println("After addAll: " + list);

        list.removeAll(anotherList);  // Remove all elements in another list from this list
        System.out.println("After removeAll: " + list);

        list.retainAll(anotherList);  // Retain only elements in another list
        System.out.println("After retainAll: " + list);

        // 10. ListIterator Operations
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Next element: " + listIterator.next());
        }

        // 11. Sorting and Searching
        list.add("Peach");
        list.add("Apple");
        list.sort(Comparator.naturalOrder());  // Sorting list
        System.out.println("Sorted List: " + list);

        int index = Collections.binarySearch(list, "Peach");  // Searching using binary search
        System.out.println("Index of 'Peach': " + index);

        // 12. Thread-Safety
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Thread-safe element");
        System.out.println("Thread-safe List: " + syncList);
    }
}
