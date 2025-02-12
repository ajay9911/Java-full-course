package Coding.problems.excel_sheet_column_title;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based indexing
            char ch = (char) ('A' + (columnNumber % 26)); // Find the character
            result.append(ch);
            columnNumber /= 26; // Move to the next digit
        }

        return result.reverse().toString(); // Reverse the result to get correct order
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.convertToTitle(100));    // Output: "A"
        System.out.println(solution.convertToTitle(28));   // Output: "AB"
        System.out.println(solution.convertToTitle(701));  // Output: "ZY"
        System.out.println(solution.convertToTitle(2147483647));  // Large test case
    }
}
