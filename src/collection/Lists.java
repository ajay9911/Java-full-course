package collection;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("ajay");
        str.add("raj");
        str.add(0,"Java");
        System.out.println(str.contains("ajay"));
        for (String o : str) {
            System.out.println(o);

        }
    }
}
