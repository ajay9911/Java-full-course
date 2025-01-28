package multiThreading.challenge;

import java.util.Map;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        try {
            Thread.sleep(getRandom()* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.getName());


    }

    private int getRandom(){
        double random= Math.random()*5+1;
        return (int)random;
    }


}
