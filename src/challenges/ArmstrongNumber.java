package challenges;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isArmstrongNumber = isArmstrongNumber(n);
        if (isArmstrongNumber) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int noOfDigits = noOfDigits(num);
        int sumOfPowers = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sumOfPowers += power(lastDigit, noOfDigits);
        }

        return sumOfPowers == originalNum;
    }

    public static int noOfDigits(int n) {
        int digits = 0;
        while (n > 0) {
            digits++;
            n = n / 10;
        }
        return digits;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
