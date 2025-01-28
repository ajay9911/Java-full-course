package method;

import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("enter First Number");
        a= sc.nextInt();
        System.out.print("enter second Number");
        b= sc.nextInt();

        int x=sumOfTwoNumber(a,b);
        System.out.println(x);

    }

    public static int sumOfTwoNumber(int a , int b){
        return a+b;
    }
}
