package practice.practice1;

public class VariableArg {
    public static void main(String[] args) {
        System.out.println(sum(10,20));

    }

    public static int sum(int x,int y,int... a){
        int sum=x+y;
        for (int i : a) {
            sum=sum+i;

        }

        return sum;
    }
}
