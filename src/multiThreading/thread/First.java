package multiThreading.thread;

public class First extends Thread{

    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<=100;i++){
            System.out.print("*");
        }
        System.out.println(Thread.currentThread().getName());

    }
}
