package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListMethodsExample {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = new ArrayList<>();

        // 1. add(E e) - Adds an element to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After add(): " + numbers);


        numbers.add(1, 15);
        System.out.println("After add(index, element): " + numbers);

        List<Integer> moreNumbers = Arrays.asList(40, 50, 60);
        numbers.addAll(moreNumbers);
        System.out.println("After addAll(): " + numbers);

        numbers.addAll(2, Arrays.asList(25, 35));
        System.out.println("After addAll(index, collection): " + numbers);

//         numbers.clear();  // Uncomment this to clear the list
//         System.out.println("After clear(): " + numbers);

        System.out.println("Contains 20: " + numbers.contains(20));

        System.out.println("Contains all numbers from moreNumbers: " + numbers.containsAll(moreNumbers));

        List<Integer> anotherList = new ArrayList<>(numbers);
        System.out.println("Lists are equal: " + numbers.equals(anotherList));

        System.out.println("Element at index 3: " + numbers.get(3));

        System.out.println("Index of 30: " + numbers.indexOf(30));

        // 11. isEmpty()
        System.out.println("Is the list empty? " + numbers.isEmpty());

        // 12. iterator() - Iterates over the list
        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Iterating using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 13. Finds the last occurrence of an element
        System.out.println("Last index of 30: " + numbers.lastIndexOf(30));

        // 14. listIterator() - Returns a list iterator over the list
        ListIterator<Integer> listIterator = numbers.listIterator();
        System.out.print("Iterating using listIterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // 15. listIterator(int index) - List iterator starting from a specific index
        ListIterator<Integer> listIteratorFrom = numbers.listIterator(2);
        System.out.print("ListIterator starting from index 2: ");
        while (listIteratorFrom.hasNext()) {
            System.out.print(listIteratorFrom.next() + " ");
        }
        System.out.println();

        // 16. remove(Object o) - Removes the first occurrence of the element
        numbers.remove(Integer.valueOf(20));
        System.out.println("After remove(Object): " + numbers);

        // 17. remove(int index) - Removes an element at a specific index
        numbers.remove(2);
        System.out.println("After remove(index): " + numbers);

        numbers.removeAll(moreNumbers);
        System.out.println("After removeAll(): " + numbers);

        // 19.  Removes elements that satisfy a predicate
        numbers.removeIf(n -> n < 30);
        System.out.println("After removeIf(): " + numbers);

        // 20. retainAll(Collection<?> c) - Retains only the elements in the list that are contained in another collection
//        numbers.retainAll(Arrays.asList(35, 50, 60));
//        System.out.println("After retainAll(): " + numbers);

        // 21. set(int index, E element) - Replaces an element at a specific index
        numbers.set(1, 55); // Replace element at index 1
        System.out.println("After set(): " + numbers);

        // 22. size() - Returns the size of the list
        System.out.println("Size of the list: " + numbers.size());

        // 23. sort(Comparator<? super E> c) - Sorts the list using a comparator
        numbers.sort(Comparator.naturalOrder());
        System.out.println("After sort(): " + numbers);

        // 24. subList(int fromIndex, int toIndex) - Returns a portion of the list
        List<Integer> sublist = numbers.subList(0,1);
        System.out.println("Sublist from index 1 to 3: " + sublist);

        // 25. toArray() - Converts the list to an array
        Object[] array = numbers.toArray();
        System.out.println("Converted to array: " + Arrays.toString(array));

        // 26. toArray(T[] a) - Converts the list to a typed array
        Integer[] arrayTyped = numbers.toArray(new Integer[0]);
        System.out.println("Converted to typed array: " + Arrays.toString(arrayTyped));
    }
}

