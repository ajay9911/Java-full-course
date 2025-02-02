package recursion.fibonacci;

public class Main {

    public static void main(String[] args) {

       int n= fib(6);
        System.out.println(n);

    }

    public  static  int fib(int n){
        if (n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
}
