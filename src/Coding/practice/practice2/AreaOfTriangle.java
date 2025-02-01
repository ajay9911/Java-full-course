package Coding.practice.practice2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double base=sc.nextDouble();
        double height=sc.nextDouble();

        double area=(base * height)/2;
        System.out.println(area);
    }
}
