package Coding.hacker_rank;

import java.util.Scanner;
/*

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he


 */
public class C8 {

    public static void main(String[] args) {
        // Read the input string
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Trim the input to remove leading/trailing spaces and split based on non-alphabetic characters
        String[] tokens = input.trim().split("[^A-Za-z]+");

        // If no tokens are found (i.e., input was empty or only contained non-alphabetic characters)
        if (tokens.length == 0 || (tokens.length == 1 && tokens[0].isEmpty())) {
            System.out.println(0);
        } else {
            // Print the number of tokens
            System.out.println(tokens.length);
            // Print each token on a new line
            for (String token : tokens) {
                if (!token.isEmpty()) {
                    System.out.println(token);
                }
            }
        }
    }
}

