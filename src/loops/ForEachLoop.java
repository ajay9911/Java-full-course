package loops;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] name= {"Ajay","Rahul","Raj","Ram"};
        printName(name);
    }
    public static void printName(String[] name){
        for (String a:name){
            System.out.println(a);
        }
    }
}
