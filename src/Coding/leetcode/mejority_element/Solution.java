package Coding.leetcode.mejority_element;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        System.out.println(nums.length/2);
        Arrays.sort(nums);
        int x=nums[nums.length / 2];
//        System.out.println(nums.length/2);
//        System.out.println(x);
        return  x;// Middle element is always the majority
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.majorityElement(new int[]{3, 2, 3})); // Output: 3
        System.out.println(solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Output: 2
    }
}

