package recursion.sum_of_subset;

import java.util.*;

public class Main {

    // Function to print subsets with a given sum
    static void findSubsetsWithSum(int[] arr, int n, int target, int currentIndex, int currentSum, List<Integer> currentSubset) {
        // If we've considered all elements
        if (currentIndex == n) {
            // If the sum of the current subset is equal to the target, print it
            if (currentSum == target) {
                System.out.println(currentSubset);
            }
            return;
        }

        // Include the current element in the subset and move to the next index
        currentSubset.add(arr[currentIndex]);
        findSubsetsWithSum(arr, n, target, currentIndex + 1, currentSum + arr[currentIndex], currentSubset);

        // Exclude the current element from the subset and move to the next index
        currentSubset.remove(currentSubset.size() - 1);
        findSubsetsWithSum(arr, n, target, currentIndex + 1, currentSum, currentSubset);
    }

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 1}; // First input array
//        int sum1 = 3;           // First target sum
//
//        System.out.println("Subsets with sum " + sum1 + ":");
//        findSubsetsWithSum(arr1, arr1.length, sum1, 0, 0, new ArrayList<>());

        int[] arr2 = {3,4,5,6,7,8,9,10}; // Second input array
        int sum2 = 30;                    // Second target sum

        System.out.println("Subsets with sum " + sum2 + ":");
        findSubsetsWithSum(arr2, arr2.length, sum2, 0, 0, new ArrayList<>());
    }
}

