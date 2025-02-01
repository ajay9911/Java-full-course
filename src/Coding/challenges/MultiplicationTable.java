package Coding.challenges;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();
        printMultiplicationTable(n);


    }

    public static void printMultiplicationTable(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));

        }

    }


}
