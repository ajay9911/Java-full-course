package ricursion.fibonacci;

public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: return n if it is 0 or 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Number of terms
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");  // Print Fibonacci number
        }
    }
}
