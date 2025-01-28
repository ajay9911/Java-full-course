package functional_programming.filter_reduce;

import java.util.Arrays;
import java.util.List;

public class FilterAndReduceExample {

    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers and calculate their sum using reduce
        int sumOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .reduce(0, Integer::sum);   // Reduce to calculate the sum

        // Print the result
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
