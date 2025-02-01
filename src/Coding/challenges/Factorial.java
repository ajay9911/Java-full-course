package Coding.challenges;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();
        long fact= printFactorial(n);
        System.out.println("Factorial Of Given Number:"+fact);

    }
    public static long printFactorial(int n){
        long fact=1;

        if (n<2){
            return 1;
        }
        for (int i=2;i<=n;i++){
            fact=fact*i;

        }
        return fact;

    }
}
