package challenges;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isArmstrongNumber = isPalindromeNumber(n);
        if (isArmstrongNumber) {
            System.out.println(n + " is an Palindrome number.");
        } else {
            System.out.println(n + " is not an Palindrome  number.");
        }
    }

    public static boolean isPalindromeNumber(int n){
        int reverse=reverseOfDigit(n);

        return n==reverse;
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
