package Coding.practice.practice1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("a="+a+"\nb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"\nb="+b);


    }
}
