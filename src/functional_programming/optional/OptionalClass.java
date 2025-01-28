package functional_programming.optional;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        List<Integer> numbers=List.of(10);
        Optional<Integer> sum=numbers.stream().reduce((a,b)->a+b);

        if (sum.isPresent()){
            System.out.println(sum.get());
        }else {
            System.out.println("list is empty");
        }

    }
}
