package Coding.challenges;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();

        int result= n1 >=0 ? n1 :-n1;
        System.out.println(result);
    }
}
