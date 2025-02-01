package Coding.challenges;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int m=sc.nextInt();
        boolean primeNumber=primeNumber(m);
        if (primeNumber){
            System.out.println("prime Number");
        }
        else {
            System.out.println("not Prime nUmber");
        }




    }

    public static boolean primeNumber(int num){
        int i=2;
        while (i<num){
            if (num %i==0){
                return false;
            }
            i++;
        }

        return true;
    }
}
