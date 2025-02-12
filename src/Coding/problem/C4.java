package Coding.problem;

import java.util.*;

public class C4{

    public static void getSmallestAndLargest(String s, int k) {
        // Create an array to store all substrings of length k
        ArrayList<String> substrings = new ArrayList<>();

        // Generate all substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }

        // Sort the substrings lexicographically
        Collections.sort(substrings);

        // The first element is the smallest, and the last element is the largest
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);

        // Print the smallest and largest substrings
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        // Call the function to get smallest and largest substrings
        getSmallestAndLargest(s, k);
        scanner.close();
    }
}
