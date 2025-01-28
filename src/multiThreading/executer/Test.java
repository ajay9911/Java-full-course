package multiThreading.executer;

import multiThreading.runnable.First;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);
        First first=new First('*');
        First first1=new First('$');

        First first2=new First('#');

        service.submit(first);
        service.submit(first1);

        service.submit(first2);

        service.shutdown();
       if( service.awaitTermination(2, TimeUnit.SECONDS)){
           service.shutdownNow();

       }
    }
}
