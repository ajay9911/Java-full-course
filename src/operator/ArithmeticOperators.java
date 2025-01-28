package operator;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("enter First Number");
        a= sc.nextInt();
        System.out.print("enter second Number");
        b= sc.nextInt();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+a*b);
        System.out.println("a/b="+(double)a/b);
        System.out.println("a%b="+a%b);

        float f1=sc.nextFloat();
        float f2= sc.nextFloat();
        float f3=f1*f2;
        System.out.println(f3);
    }
}
