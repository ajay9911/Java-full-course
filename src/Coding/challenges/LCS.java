package Coding.challenges;

import java.util.Scanner;

public class LCS {

    // Method to calculate LCS for two strings and return the LCS table with arrows
    public static void lcsString(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        // Create a DP table and an arrow table for tracking the path
        int[][] dp = new int[m + 1][n + 1];
        char[][] arrows = new char[m + 1][n + 1];

        // Fill the DP table and the arrow table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    arrows[i][j] = '↖';  // Diagonal arrow (match)
                } else {
                    if (dp[i - 1][j] >= dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        arrows[i][j] = '↑';  // Upward arrow (no match, move up)
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        arrows[i][j] = '←';  // Leftward arrow (no match, move left)
                    }
                }
            }
        }

        // Print the DP table with arrows and values of X and Y
        System.out.println("DP Table with Arrows:");
        System.out.print("     ");
        for (int j = 0; j < n; j++) {
            System.out.print(Y.charAt(j) + "   ");
        }
        System.out.println();

        for (int i = 0; i <= m; i++) {
            if (i == 0) {
                System.out.print("    ");
            } else {
                System.out.print(X.charAt(i - 1) + "   ");
            }
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    System.out.print(dp[i][j] + "   ");
                } else {
                    System.out.print(dp[i][j] + " " + arrows[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Reconstruct the LCS from the arrow table
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (arrows[i][j] == '↖') {
                lcs.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (arrows[i][j] == '↑') {
                i--;
            } else {
                j--;
            }
        }

        // Print the LCS length and the LCS sequence
        System.out.println("Length of LCS: " + dp[m][n]);
        System.out.println("LCS: " + lcs.reverse().toString());
    }

    // Method to calculate LCS for two arrays of numbers and return the LCS table with arrows
    public static void lcsArray(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Create a DP table and an arrow table for tracking the path
        int[][] dp = new int[m + 1][n + 1];
        char[][] arrows = new char[m + 1][n + 1];

        // Fill the DP table and the arrow table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    arrows[i][j] = '↖';  // Diagonal arrow (match)
                } else {
                    if (dp[i - 1][j] >= dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        arrows[i][j] = '↑';  // Upward arrow (no match, move up)
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        arrows[i][j] = '←';  // Leftward arrow (no match, move left)
                    }
                }
            }
        }

        // Print the DP table with arrows and values of X and Y
        System.out.println("DP Table with Arrows:");
        System.out.print("     ");
        for (int j = 0; j < n; j++) {
            System.out.print(Y[j] + "   ");
        }
        System.out.println();

        for (int i = 0; i <= m; i++) {
            if (i == 0) {
                System.out.print("    ");
            } else {
                System.out.print(X[i - 1] + "   ");
            }
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    System.out.print(dp[i][j] + "   ");
                } else {
                    System.out.print(dp[i][j] + " " + arrows[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Reconstruct the LCS from the arrow table
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (arrows[i][j] == '↖') {
                lcs.append(X[i - 1]);
                i--;
                j--;
            } else if (arrows[i][j] == '↑') {
                i--;
            } else {
                j--;
            }
        }

        // Print the LCS length and the LCS sequence
        System.out.println("Length of LCS: " + dp[m][n]);
        System.out.println("LCS: " + lcs.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose input type: String or Array
        System.out.println("Enter 1 to input Strings or 2 to input Arrays of Numbers:");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Input two strings
            System.out.println("Enter the first string:");
            String X = sc.next();
            System.out.println("Enter the second string:");
            String Y = sc.next();

            // Calculate LCS for strings and print the table
            lcsString(X, Y);
        } else if (choice == 2) {
            // Input two arrays of numbers
            System.out.println("Enter the length of the first array:");
            int m = sc.nextInt();
            int[] X = new int[m];
            System.out.println("Enter the elements of the first array:");
            for (int i = 0; i < m; i++) {
                X[i] = sc.nextInt();
            }

            System.out.println("Enter the length of the second array:");
            int n = sc.nextInt();
            int[] Y = new int[n];
            System.out.println("Enter the elements of the second array:");
            for (int i = 0; i < n; i++) {
                Y[i] = sc.nextInt();
            }

            // Calculate LCS for arrays and print the table
            lcsArray(X, Y);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
