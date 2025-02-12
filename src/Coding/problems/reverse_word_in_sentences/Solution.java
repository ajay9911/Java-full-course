package Coding.problems.reverse_word_in_sentences;

import java.util.*;

public class Solution {

    // Function to reverse the words in a string
    public String reverseWords(String s) {
        // Split the string by spaces, remove empty strings (to handle multiple spaces)
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        Collections.reverse(Arrays.asList(words));

        // Join the words with a single space and return the result
        return String.join(" ", words);
    }

    // Main method to test the reverseWords function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String input1 = "the sky is blue";
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(input1) + "\"");

        // Test case 2
        String input2 = "  hello world  ";
        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(input2) + "\"");

        // Test case 3
        String input3 = "a good   example";
        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Reversed: \"" + solution.reverseWords(input3) + "\"");
    }
}
