package multiThreading.runnable;

public class First implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10000;i++){
            System.out.print(targetChar);
            for (int j=1;j<=10000;j=j+100){
                if (i==j){
                    System.out.println();

                }

            }
        }
        System.out.println(Thread.currentThread().getName());

    }

    public First(char targetChar) {
        this.targetChar = targetChar;
    }

    private final char targetChar;

}
