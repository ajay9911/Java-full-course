package Coding.problem;


import java.util.Scanner;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int position) {
        if (position >= game.length) {
            // If we've moved beyond the last index, we win.
            return true;
        }
        if (position < 0 || game[position] == 1) {
            // If we're out of bounds or on a blocked cell, we lose.
            return false;
        }

        // Mark the current position as visited to avoid infinite recursion.
        game[position] = 1;

        // Try all possible moves:
        // Move forward
        if (isSolvable(leap, game, position + 1)) {
            return true;
        }
        // Move backward
        if (isSolvable(leap, game, position - 1)) {
            return true;
        }
        // Leap forward
        if (isSolvable(leap, game, position + leap)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of queries

        while (q-- > 0) {
            int n = scanner.nextInt(); // Size of the game array
            int leap = scanner.nextInt(); // Leap size

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }

        scanner.close();
    }
}
