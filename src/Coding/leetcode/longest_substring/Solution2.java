package Coding.leetcode.longest_substring;

import java.util.HashMap;
import java.util.Scanner;

class Solution2 {
    public static int lengthOfLongestSubstring(String str) {
        HashMap<Character, Integer> lastSeenIndex = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);

            // If the character is already in the map and within the current window
            if (lastSeenIndex.containsKey(currentChar) && lastSeenIndex.get(currentChar) >= left) {
                left = lastSeenIndex.get(currentChar) + 1; // Move left boundary
            }

            // Store/update the last seen index of the character
            lastSeenIndex.put(currentChar, right);

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();


        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
