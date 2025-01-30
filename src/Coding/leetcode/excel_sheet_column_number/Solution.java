package Coding.leetcode.excel_sheet_column_number;

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char ch : columnTitle.toCharArray()) {
            int value = ch - 'A' + 1; // Convert 'A'-'Z' to 1-26
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.titleToNumber("A"));   // Output: 1
        System.out.println(solution.titleToNumber("AB"));  // Output: 28
        System.out.println(solution.titleToNumber("ZY"));  // Output: 701
        System.out.println(solution.titleToNumber("FXSHRXW")); // Large test case
    }
}
