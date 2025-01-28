package opps.passby_value_and_reference;

public class PassByValue {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        int sum=add(x,y);
        System.out.println(sum+" "+x+" "+y);
    }
    public static int add(int x, int y){
        x=100;
//        return x+y;
        return x=x+y;
    }
}
