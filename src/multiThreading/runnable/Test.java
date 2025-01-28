package multiThreading.runnable;

import multiThreading.runnable.First;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis(); // Record start time

        First f1=new First('A');
        First f2=new First('B');
        First f3=new First('C');

        Thread t1=new Thread(f1);
        System.out.println("Thread 0 Start");
        t1.start();
        System.out.println("Thread 0 End");

        Thread t2=new Thread(f2);
        System.out.println("Thread 1 Start");

        t2.start();
        t1.join();
        System.out.println("Thread 1 End");


        Thread t3=new Thread(f3);


        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 2 Start");
        t3.start();
        System.out.println("Thread 2 End");

        long endTime = System.currentTimeMillis(); // Record end time
        long timeTaken = endTime - startTime; // Calculate elapsed time

        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println(Thread.currentThread().getName());





    }
}
