package multiThreading.thread;

public class Third extends Thread{
    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<=100;i++){
            System.out.print("@");

//            sum+=i;
        }
//        System.out.println(sum);
        System.out.println(Thread.currentThread().getName());
    }
}
