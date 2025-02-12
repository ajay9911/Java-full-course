package Coding.problem;

import java.util.Scanner;
import java.util.HashSet;

public class C11 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());  // Read number of sentences

        // Loop over each sentence
        while (numSentences-- > 0) {
            String input = in.nextLine();  // Read the sentence

            // Set to track words already seen (case-insensitive)
            HashSet<String> seenWords = new HashSet<>();

            // Split sentence into words
            String[] words = input.split("\\s+");
            StringBuilder result = new StringBuilder();

            // Process each word
            for (String word : words) {
                String lowerWord = word.toLowerCase();  // Convert word to lowercase for comparison

                // Add the word if it has not been seen before
                if (!seenWords.contains(lowerWord)) {
                    // Add the word to the result
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                    seenWords.add(lowerWord);  // Mark this word as seen
                }
            }

            // Print the resulting sentence without duplicates
            System.out.println(result.toString());
        }

        in.close();  // Close the scanner
    }
}

