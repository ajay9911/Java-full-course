package collection.linnedlist.method.remove;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.remove("Banana");
        System.out.println(list);  // Output: [Apple, Cherry]
    }
}
