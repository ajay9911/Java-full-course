package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1; // Math.random() generates 0.0 to 0.999..., multiply by 100 and add 1
           list.add(randomNumber);
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
