package practice.practice2;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter all size of in cm");
        double a=sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();
        double perimeter=a+b+c+d;
        System.out.println(perimeter);

    }
}
