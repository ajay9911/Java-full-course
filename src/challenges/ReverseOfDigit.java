package challenges;

import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int m=sc.nextInt();
        int reverse=reverseOfDigit(m);
        System.out.println(reverse);
    }

    public static int reverseOfDigit(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev *10+digit;
            n=n/10;

        }

        return rev;

    }
}
