package Coding.leetcode;



public class StringToInteger {
    public int myAtoi(String s) {
        // Remove leading whitespaces
        s = s.trim();

        // If the string is empty, return 0
        if (s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        long result = 0;

        // Check for the sign character
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Read the digits and form the number
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0'; // Convert char to int
            result = result * 10 + digit;
            index++;

            // Handle overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        // Return the result with the correct sign
        return (int) result * sign;
    }

    public static void main(String[] args) {
        StringToInteger solution = new StringToInteger();

        // Test cases
        System.out.println(solution.myAtoi("42"));            // Output: 42
        System.out.println(solution.myAtoi("   -042"));       // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));      // Output: 1337
        System.out.println(solution.myAtoi("0-1"));           // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
        System.out.println(solution.myAtoi("21474836460"));   // Output: 2147483647 (overflow case)
        System.out.println(solution.myAtoi("-21474836490"));  // Output: -2147483648 (underflow case)
    }
}

