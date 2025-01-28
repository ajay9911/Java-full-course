package functional_programming.filter_reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8);
        int sumNew= numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });

        System.out.println(sumNew);

        int sumNew2= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sumNew2);

        int max= numbers.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println(max);
    }
}
