package Coding.problems;


public class SearchInsertionIndex {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums1, 5));  // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums2, 2));  // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums3, 7));  // Output: 4
    }
}

