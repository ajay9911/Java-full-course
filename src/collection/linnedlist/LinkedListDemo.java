package collection.linnedlist;



import java.util.*;
public class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        for (String s : al) {
            System.out.println(s);
        }
//        System.out.println(al.pop());
//        System.out.println(al);
        System.out.println(al.lastIndexOf("Ajay"));
        System.out.println(al.get(1));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
    }

}