package collection.arraylist.method;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        // add(): append the specified element at the end of a list.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        // void add(int index, E element):used to insert the specified element at the specified position in a list.
        numbers.add(1,22222);
        System.out.println(numbers);

        //clear(): used to remove all of the elements
//        numbers.clear();



        System.out.println();

    }

}
