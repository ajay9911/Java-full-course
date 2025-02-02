package recursion.factorial;

public class Factorial {
    public static void main(String[] args) {

        long fact=printFactorial(10);
        System.out.println(fact);
    }

    public static int printFactorial(int n){


        if (n==0){
            return 1;
        }
        return n*printFactorial(n-1);



    }
}
