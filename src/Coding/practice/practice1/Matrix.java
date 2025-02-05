package Coding.practice.practice1;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

//        System.out.println("4×4 Matrix:");
        int i = 0, j = matrix[0].length - 1, target = 16;

        // Keep going until we are out of bounds in either direction
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Target Found at " + i + "," + j);
               break;
            }
            if (matrix[i][j] > target) {
                j--;  // Move left if the current element is greater than the target
            } else {
                i++;  // Move down if the current element is smaller than the target
            }
        }

        System.out.println("Target not found.");
    }
    }


