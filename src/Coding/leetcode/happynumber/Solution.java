package Coding.leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        // Set to track previously encountered numbers
        Set<Integer> vis = new HashSet<>();

        // Keep iterating until n becomes 1 or we encounter a cycle
        while (n != 1 && !vis.contains(n)) {
            // Add the current number to the set to track it
            vis.add(n);

            // Calculate the sum of the squares of the digits of n
            int x = 0;
            while (n != 0) {
                x += (n % 10) * (n % 10);  // Sum the squares of digits
                n /= 10;  // Reduce n by removing the last digit
            }
            n = x;  // Update n with the new value
        }

        // If n becomes 1, it's a happy number; otherwise, it's not
        return n == 1;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int n1 = 19;
        int n2 = 2;

        // Output the results
        System.out.println("Is " + n1 + " a happy number? " + sol.isHappy(n1)); // Expected: true
        System.out.println("Is " + n2 + " a happy number? " + sol.isHappy(n2)); // Expected: false
    }
}
