package Coding.challenges;

import java.util.Scanner;

public class MinMaxTernary {
    public static void main(String[] args) {
        MinMaxTernary m=new MinMaxTernary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("enter second number");
        int n2=sc.nextInt();
        int min=m.min(n1,n2);
        System.out.println(min);

        int max=m.max(n1,n2);
        System.out.println(max);
    }

    public int min(int n1,int n2 ){
        int min=n1<n2?n1:n2;
        return min;

    }

    public int max(int n1,int n2 ){

        int max=n1>n2?n1:n2;
        return max;
    }
}
