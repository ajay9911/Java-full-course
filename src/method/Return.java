package method;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        int x=readNumbers();
        System.out.println(x);





    }
    public static int readNumbers(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a= sc.nextInt();
//        int b=sc.nextInt();
        return a;

    }
}
