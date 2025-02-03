package recursion.nqueen;

public class NQueen {

    // Function to print the board
    static void printBoard(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if a queen can be placed on board[row][col]
    static boolean isSafe(int[][] board, int row, int col, int N) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Backtracking function to solve N Queens problem
    static boolean solveNQueensUtil(int[][] board, int row, int N) {
        // If all queens are placed
        if (row >= N) {
            return true;
        }

        // Try placing this queen in all columns one by one
        for (int col = 0; col < N; col++) {
            // Check if the queen can be placed on board[row][col]
            if (isSafe(board, row, col, N)) {
                // Place the queen
                board[row][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueensUtil(board, row + 1, N)) {
                    return true;
                }

                // If placing queen in board[row][col] doesn't lead to a solution
                board[row][col] = 0; // Backtrack
            }
        }

        // If the queen cannot be placed in any column in this row
        return false;
    }

    // Main function to solve N Queens problem
    static void solveNQueens(int N) {
        int[][] board = new int[N][N];

        if (!solveNQueensUtil(board, 0, N)) {
            System.out.println("Solution does not exist");
            return;
        }

        printBoard(board, N);
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int N = 6;  // You can change N to any number for different sizes
        solveNQueens(N);
    }
}
