package Coding.problems.uglyNumber;

class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers must be positive, so return false if n is less than 1
        if (n < 1) return false;

        // Divide n by 2 as long as it is divisible by 2
        while (n % 2 == 0) {
            n /= 2;
        }

        // Divide n by 3 as long as it is divisible by 3
        while (n % 3 == 0) {
            n /= 3;
        }

        // Divide n by 5 as long as it is divisible by 5
        while (n % 5 == 0) {
            n /= 5;
        }

        // If after removing all factors of 2, 3, and 5, n becomes 1, return true
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testNumbers = {1, 6, 8, 14, 25, 30, 50, 75, 100, 150, 0, -5, -10};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " an ugly number? " + solution.isUgly(num));
        }
    }
}
