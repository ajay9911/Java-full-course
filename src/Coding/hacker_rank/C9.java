package Coding.hacker_rank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class C9 {

    public static void main(String[] args) {
        // Read number of test cases
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        // Process each test case
        for (int i = 0; i < t; i++) {
            String pattern = scanner.nextLine();

            // Try to compile the pattern
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}

