package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        for (Integer i : queue) {
            System.out.println(i);

        }
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
//        queue.remove();
        System.out.println(queue.remove());
    }
}
