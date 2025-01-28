package Coding.leetcode;



public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Reverse the number
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Compare the original number with the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        // Test cases
        System.out.println(solution.isPalindrome(121));    // Output: true
        System.out.println(solution.isPalindrome(-121));   // Output: false
        System.out.println(solution.isPalindrome(10));     // Output: false
        System.out.println(solution.isPalindrome(0));      // Output: true
    }
}
