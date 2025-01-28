package multiThreading.thread;

public class Test {
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis(); // Record start time

        First first=new First();
        Second second=new Second();
        Third third=new Third();
        first.start();
        second.start();
        third.start();
        double endTime = System.currentTimeMillis(); // Record end time
        double timeTaken = endTime - startTime; // Calculate elapsed time

        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println(Thread.currentThread().getName());
    }
}
