package Coding.problems.longest_substring;

import java.util.Scanner;

class Solution1 {
    public int lengthOfLongestSubstring(String str) {
        int[] charCount = new int[128]; // Array to track character occurrences
        int maxLength = 0, left = 0;

        for (int right = 0; right < str.length(); right++) {
            charCount[str.charAt(right)]++; // Increment count of the current character

            // If a character is repeated, shrink the window from the left
            while (charCount[str.charAt(right)] > 1)
                charCount[str.charAt(left++)]--;

            // Update max length of the substring without repeating characters
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Solution1 solution = new Solution1();
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
