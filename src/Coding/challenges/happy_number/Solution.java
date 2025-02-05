package Coding.challenges.happy_number;

import java.util.HashSet;
import java.util.Set;

class Solution {

    // Helper function to check if a number is a happy number
    public boolean isHappy(int n) {
        Set<Integer> vis = new HashSet<>();

        while (n != 1 && !vis.contains(n)) {
            vis.add(n);
            int x = 0;
            while (n != 0) {
                x += (n % 10) * (n % 10);  // Sum the squares of digits
                n /= 10;  // Remove last digit
            }
            n = x;  // Update n with the new sum
        }

        return n == 1;  // Return true if n becomes 1
    }

    // Function to print all happy numbers between m and n
    public void printHappyNumbers(int m, int n) {
        System.out.println("Happy numbers between " + m + " and " + n + ":");

        for (int i = m; i <= n; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");  // Print happy number
            }
        }
        System.out.println();  // For better formatting
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case: Find happy numbers between 1 and 50
        sol.printHappyNumbers(1, 50);
    }
}

