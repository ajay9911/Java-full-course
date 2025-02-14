package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing the list
        System.out.println(list); // Output: [10, 20, 30]

        // Checking if the list contains certain values
        System.out.println(list.contains(10));  // Output: true (10 is present)
        System.out.println(list.contains(100)); // Output: false (100 is not present)

        // Removing an element by index
        list.remove(1);  // Removes element at index 1 (i.e., 20)
        System.out.println(list); // Output: [10, 30]

        // Adding an element at a specific index
        list.add(0, 250);  // Adds 250 at index 0
        System.out.println(list.get(0)); // Output: 250

        // Updating an element at a specific index
        list.set(0, 150);  // Sets index 0 value to 150 (replaces 250)
        System.out.println(list); // Output: [150, 10, 30]

        // Getting the size of the list
        System.out.println(list.size()); // Output: 3

        // Creating an immutable list using List.of()
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list1); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Adding all elements of list1 to list
        list.addAll(list1);
        System.out.println(list); // Output: [150, 10, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Removing an element by value
        list.remove(Integer.valueOf(150)); // Removes the element 150 (not index 150)
        System.out.println(list); // Output: [10, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Sorting the list in ascending order
        list.sort(null); // Using natural order (ascending)
        System.out.println(list); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 30]
    }
}
