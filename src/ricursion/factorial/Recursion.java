package ricursion.factorial;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long factorial=factorial(n);
        System.out.println(factorial);
    }

    public static long factorial(int n){
        System.out.println(n);
        if (n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
