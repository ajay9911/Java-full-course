package Coding.problems;



public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the area between the two pointers
            int width = right - left;
            int currentArea = Math.min(height[left], height[right]) * width;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Example 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height1)); // Output: 49

        // Example 2
        int[] height2 = {1, 1};
        System.out.println(solution.maxArea(height2)); // Output: 1

        // Additional example
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println(solution.maxArea(height3)); // Output: 16
    }
}

