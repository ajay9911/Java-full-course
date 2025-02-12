package Coding.problems.single_Number;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i]; // Unique number found
            }
        }

        return nums[nums.length - 1]; // Last element is the single one
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        // Print results
        System.out.println("Single Number in nums1: " + solution.singleNumber(nums1)); // Output: 1
        System.out.println("Single Number in nums2: " + solution.singleNumber(nums2)); // Output: 4
        System.out.println("Single Number in nums3: " + solution.singleNumber(nums3)); // Output: 1
    }
}
