package Coding.challenges.permutation;

import java.util.Scanner;

class Solution {
    /**
     * This method returns the k-th permutation of numbers from 1 to n.
     * It finds the k-th permutation using a mathematical approach rather than generating all permutations.
     */
    public static String getPermutation(int n, int k) {
        StringBuilder permutation = new StringBuilder(); // Stores the final permutation sequence
        boolean[] visited = new boolean[n + 1]; // Keeps track of used numbers

        for (int i = 0; i < n; ++i) {
            int factorial = 1; // Factorial of remaining numbers
            for (int j = 1; j < n - i; ++j) {
                factorial *= j; // Compute factorial of (n - i - 1)
            }

            // Iterate over possible numbers from 1 to n
            for (int num = 1; num <= n; ++num) {
                if (!visited[num]) { // If the number is not used
                    if (k > factorial) { // If k is greater than factorial, it means the number is not in the current range
                        k -= factorial; // Reduce k by factorial count
                    } else {
                        permutation.append(num); // Select the number
                        visited[num] = true; // Mark it as used
                        break; // Move to the next digit
                    }
                }
            }
        }
        return permutation.toString(); // Return the final k-th permutation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for n (size of the sequence)
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        // Taking user input for k (which permutation to find)
        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();


        // Printing the result
        System.out.println("The " + k + "th permutation of " + n + " numbers is: " +getPermutation(n, k));

        scanner.close(); // Closing the scanner to prevent memory leaks
    }
}
