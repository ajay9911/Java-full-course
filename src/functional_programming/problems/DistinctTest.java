package functional_programming.problems;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,5,6,7,8,9,1,1,1,1,2);
        List<Integer> number=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(number);
    }
}
