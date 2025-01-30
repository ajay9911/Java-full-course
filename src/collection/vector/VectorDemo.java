package collection.vector;


import java.util.*;
public class VectorDemo{
    public static void main(String[] args){
        Vector<String> v=new Vector<>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");

        System.out.println(v);
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Vector<Integer> num=new Vector<>();
        for (int i=0;i<=10;i++){
            num.add(i);
        }
        System.out.println(num);
    }
}

