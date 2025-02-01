package Coding.challenges;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();
        int sum=sumOfDigit(n);
        System.out.println(sum);
    }

    public static int sumOfDigit(int n){
        int sum=0;
        while (n>0){

                sum=sum+(n%10);
                n=n/10;


        }

        return sum;
    }
}
