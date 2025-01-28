package Coding.hacker_rank;

import java.io.*;
import java.text.*;
import java.util.*;

public class C2 {

    public static void main(String[] args) {
        // Create a scanner to read the input
        Scanner scanner = new Scanner(System.in);

        // Read the double-precision number representing the amount of money
        double payment = scanner.nextDouble();

        // Set up locales for each country
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");  // India does not have a built-in Locale, so use en-IN
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Get NumberFormat instances for each locale
        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);

        // Print the formatted payments
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        // Close the scanner
        scanner.close();
    }
}

