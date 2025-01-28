package Coding.hacker_rank;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts the following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String dayOfWeek = new java.text.SimpleDateFormat("EEEE").format(calendar.getTime());
        return dayOfWeek.toUpperCase();
    }

}

public class C1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Instead of writing to a file, we'll print to the console
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Directly output to console
        // Read the input
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Get the result from the findDay method
        String res = Result.findDay(month, day, year);

        // Output the result to the console
        System.out.println(res);

        // Close the buffered reader
        bufferedReader.close();
    }
}
