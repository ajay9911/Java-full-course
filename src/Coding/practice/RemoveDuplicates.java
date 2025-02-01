package Coding.practice;
import java.io.*;


public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();
            int len = obj.removeDuplicates(arr);
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}



// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Handle edge case for empty array

        int j = 0; // Pointer for the position of distinct elements

        for (int i = 0; i < arr.length; i++) {
            // Place the first element or any element different from the previous
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++; // Increment the pointer for the next distinct position
            }
        }

        // Return the size of the modified array containing distinct elements
        return j;
    }
}
