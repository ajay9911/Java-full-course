package multiThreading.thread;

public class MultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Record start time

        for (int i=1;i<=100000;i++){
            //System.out.print(i+" ");
            int sum=0;
            sum+=i;
        }
        for (int i=1;i<=100000;i++){
            //System.out.print(i+" ");
            int sum=0;
            sum+=i;
        }
        for (int i=1;i<=100000;i++){
            //System.out.print(i+" ");
            int sum=0;
            sum+=i;
        }
        for (int i=1;i<=100000;i++){
            //System.out.print(i+" ");
            int sum=0;
            sum+=i;
        }
        long endTime = System.currentTimeMillis(); // Record end time
        long timeTaken = endTime - startTime; // Calculate elapsed time

        System.out.println("Time taken: " + timeTaken + " ms");
    }
}
