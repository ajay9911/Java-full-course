package collection.vector.method;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class VectorMethodsDemo {
    public static void main(String[] args) {
        // 1️⃣ Creating a Vector
        Vector<Integer> vector = new Vector<>();

        // 2️⃣ Adding Elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.println("Vector after adding elements: " + vector);

        // 3️⃣ Adding Element at a Specific Index
        vector.add(2, 25); // Adds 25 at index 2
        System.out.println("After adding at index 2: " + vector);

        // 4️⃣ Adding All Elements from Another Collection
        List<Integer> list = List.of(60, 70, 80);
        vector.addAll(list);
        System.out.println("After adding list elements: " + vector);

        // 5️⃣ Accessing Elements
        System.out.println("Element at index 3: " + vector.get(3));

        // 6️⃣ Updating an Element
        vector.set(0, 100); // Updates first element to 100
        System.out.println("After updating first element: " + vector);

        // 7️⃣ Removing Elements
        vector.remove(1); // Removes element at index 1
        vector.remove(Integer.valueOf(50)); // Removes element 50
        System.out.println("After removing elements: " + vector);

        // 8️⃣ Checking if an Element Exists
        System.out.println("Vector contains 30? " + vector.contains(30));

        // 9️⃣ Getting Size of Vector
        System.out.println("Size of vector: " + vector.size());

        // 🔟 Checking if Vector is Empty
        System.out.println("Is vector empty? " + vector.isEmpty());

        // 1️⃣1️⃣ Cloning a Vector
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // 1️⃣2️⃣ Getting First and Last Elements
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // 1️⃣3️⃣ Iterating using Enumeration
        Enumeration<Integer> enumeration = vector.elements();
        System.out.print("Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // 1️⃣4️⃣ Iterating using Iterator
        Iterator<Integer> iterator = vector.iterator();
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 1️⃣5️⃣ Iterating using for-each loop
        System.out.print("For-each loop: ");
        for (Integer num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 1️⃣6️⃣ Converting Vector to Array
        Integer[] array = vector.toArray(new Integer[0]);
        System.out.print("Array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 1️⃣7️⃣ Clearing the Vector
        vector.clear();
        System.out.println("After clearing, is vector empty? " + vector.isEmpty());
    }
}

