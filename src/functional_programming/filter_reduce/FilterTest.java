package functional_programming.filter_reduce;

import java.util.List;
import java.util.function.Consumer;

public class FilterTest {
    public static void main(String[] args) {

        List<String> fruits=List.of("apple","banana","mango","papaya","guava");
        System.out.println(fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);

        }

        System.out.println("----------------------");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("----------------------");

        fruits.stream().filter(fruit->fruit.endsWith("a"))
        .forEach(fruit-> System.out.println(fruit));

    }

}
