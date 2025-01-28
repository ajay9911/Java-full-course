package opps.polymorphism.overloading;

public class OverLoading {
    OverLoading(){
        System.out.println("Default Constructor");
    }
    OverLoading(String name){
        System.out.println("My name is :"+name);
    }
    public int add(int a, int b){
        return a+b;
    }

    public int add (int a, int b, int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        OverLoading overLoading=new OverLoading();
        System.out.println(overLoading.add(10,20,30));
        System.out.println(overLoading.add("10","29"));

        OverLoading overLoading1=new OverLoading("Ajay");

    }
}
