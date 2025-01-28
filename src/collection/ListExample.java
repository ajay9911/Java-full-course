package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Printing the List
        System.out.println("Fruits List: " + fruits);

        // Accessing elements
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Removing an element
        fruits.remove("Banana");

        // Printing the updated List
        System.out.println("Updated Fruits List: " + fruits);

        // Checking if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Iterating over the List
        System.out.println("Iterating over the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
