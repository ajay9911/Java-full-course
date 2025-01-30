package collection.arraylist;


import java.util.*;
class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }



    }
}