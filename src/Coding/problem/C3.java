package Coding.problem;

import java.util.*;

public class C3 {

    public static void main(String[] args) {
        // Reading input
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();  // First string
        String b = scanner.nextLine();  // Second string
        scanner.close();

        // 1. Sum the lengths of both strings
        int lengthSum = a.length() + b.length();
        System.out.println(lengthSum);

        // 2. Lexicographically compare the two strings
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of both strings and print them
        String capitalizedA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedB = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
