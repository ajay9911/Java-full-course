package ricursion.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Recursive function to generate subsets
    public static void generateSubsets(int[] arr, int index, List<Integer> currentSubset) {
        // Base case: If index reaches the end, print the subset
        if (index == arr.length) {
            System.out.println(currentSubset);
            return;
        }

        // Include the current element
        currentSubset.add(arr[index]);
        generateSubsets(arr, index + 1, currentSubset);

        // Backtrack and exclude the current element
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(arr, index + 1, currentSubset);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};  // Input array
        System.out.println("Actual Array:"+ Arrays.toString(arr));
        System.out.println("Subsets:");
        generateSubsets(arr, 0, new ArrayList<>());
    }
}
