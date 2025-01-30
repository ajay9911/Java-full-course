package collection.stack;


import java.util.*;
public class StackDemo{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
        System.out.println(stack.pop());
    }
}
