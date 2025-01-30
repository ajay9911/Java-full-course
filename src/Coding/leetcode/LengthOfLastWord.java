package Coding.leetcode;


/*

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 */


public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        // Calculate the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {


        // Example 1
        String s1 = "Hello World";
        System.out.println("Output: " + lengthOfLastWord(s1)); // Output: 5

        // Example 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Output: " + lengthOfLastWord(s2)); // Output: 4

        // Example 3
        String s3 = "luffy is still joyboy";
        System.out.println("Output: " + lengthOfLastWord(s3)); // Output: 6
    }
}

