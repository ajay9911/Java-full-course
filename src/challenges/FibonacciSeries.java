package challenges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();

        fibonacciSeries(n);

    }

    public static void fibonacciSeries(int n){
        int a=0,b=1;
        if (n<= 0) return;

        System.out.print(a+" ");
        System.out.print(b+" ");



        for(int i=3;i<=n;i++){
            int next= a +b;
            System.out.print(next+" ");
            a=b;
            b=next;

        }




    }
}
