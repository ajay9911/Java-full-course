package Coding.challenges.stringMatching;

public class Main {
    static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Loop to slide the pattern over the text
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check for pattern match at current position
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If full pattern is matched
            if (j == m) {
                int startIndex = i;
                int endIndex = i + m - 1;
                System.out.println("Pattern found from index " + startIndex + " to " + endIndex);
            }
        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        search(text, pattern);
    }
}
