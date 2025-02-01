package Coding.challenges;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int marks=sc.nextInt();
        String category= marks>80 ? "High" :(marks>50?"moderate":"low");
        System.out.println(category);
    }
}
