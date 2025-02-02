package recursion.permutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        permutation(arr, 0);  // Start from index 0
    }

    // Recursive permutation function
    static void permutation(int[] arr, int start) {
        // Base case: if we reach the end of the array, print the permutation
        if (start == arr.length) {
            System.out.println(Arrays.toString(arr));
        } else {
            // For each index starting from 'start' to the end
            for (int i = start; i < arr.length; i++) {
                // Skip if the element is the same as the previous element (this prevents duplicates)
                if (i != start && arr[i] == arr[start]) continue;

                // Swap the current index with the start index
                swap(arr, start, i);

                // Recursively permute the rest of the array
                permutation(arr, start + 1);

                // Backtrack: swap back to the original state to explore new permutations
                swap(arr, start, i);  // Only necessary in a full backtracking scenario
            }
        }
    }

    // Helper function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
