package collection.stack.method;

import java.util.Stack;

public class StackMethodsDemo {
    public static void main(String[] args) {
        // 1️⃣ Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // 2️⃣ Pushing elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after push operations: " + stack);

        // 3️⃣ Popping elements from the Stack (LIFO)
        System.out.println("Popped element: " + stack.pop()); // Removes 50
        System.out.println("Stack after pop: " + stack);

        // 4️⃣ Peeking the top element (without removing)
        System.out.println("Top element: " + stack.peek()); // 40

        // 5️⃣ Searching for an element (returns 1-based position)
        System.out.println("Position of 30: " + stack.search(30)); // Position from top

        // 6️⃣ Checking if the Stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 7️⃣ Checking size of the Stack
        System.out.println("Size of stack: " + stack.size());

        // 8️⃣ Iterating using for-each loop
        System.out.print("Stack elements: ");
        for (Integer num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9️⃣ Iterating using while loop with pop
        System.out.print("Popping all elements: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // 🔟 Checking if stack is empty after popping all elements
        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty());
    }
}
