package multiThreading.synchronize;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis(); // Record start time

        Counter counter=new Counter();
        UpdaterThread t1=new UpdaterThread(counter);
        UpdaterThread t2=new UpdaterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis(); // Record end time
        long timeTaken = endTime - startTime; // Calculate elapsed time
        System.out.println(counter.getCount());

        System.out.println("Time taken: " + timeTaken + " ms");

        Thread.sleep(1000);
        System.out.println("After Thread sleeping");

    }
}
