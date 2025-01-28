package Coding.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        // Define the 32-bit integer limits
        int INT_MIN = -2147483648;
        int INT_MAX = 2147483647;

        // Store the sign of x and work with the absolute value of x
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        // Reverse the digits
        long reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;

            // Check for overflow or underflow
            if (reversed > INT_MAX) {
                return 0;
            }
        }

        // Apply the sign to the result
        reversed *= sign;

        // If the result is outside the 32-bit integer range, return 0
        if (reversed < INT_MIN || reversed > INT_MAX) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Test cases
        System.out.println(solution.reverse(123));      // Output: 321
        System.out.println(solution.reverse(-123));     // Output: -321
        System.out.println(solution.reverse(120));      // Output: 21
        System.out.println(solution.reverse(0));        // Output: 0
        System.out.println(solution.reverse(15342)); // Output: 0 (overflow)
    }
}
