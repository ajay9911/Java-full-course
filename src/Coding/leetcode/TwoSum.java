package Coding.leetcode;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    // Method to find two numbers that sum up to the target
    public int[] twoSum(int[] nums, int target) {
        // Use Map interface for better flexibility
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in the map, we found the solution
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // The problem guarantees one solution, no need for a return here
        // No need to handle the case of no solution since the guarantee ensures a solution
        return new int[] {};
    }

    // Main method to test the twoSum function
    public static void main(String[] args) {
        // Test the TwoSum function
        TwoSum solution = new TwoSum();

        // Example test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test case 1 result: [" + result1[0] + ", " + result1[1] + "]");

        // Example test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test case 2 result: [" + result2[0] + ", " + result2[1] + "]");

        // Example test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test case 3 result: [" + result3[0] + ", " + result3[1] + "]");
    }
}
