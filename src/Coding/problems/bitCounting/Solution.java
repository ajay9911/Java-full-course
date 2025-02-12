package Coding.problems.bitCounting;

import java.util.Arrays;

public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            ans[i] = Integer.bitCount(i); // Count number of 1s in binary representation
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // Example input
        System.out.println("Input: " + n);
        System.out.println("Output: " + Arrays.toString(solution.countBits(n)));
    }
}
