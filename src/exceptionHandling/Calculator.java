package exceptionHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//        catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
//            System.out.println(exception.toString());
//        }

        a();


    }

    private static void a(){
        b();

    }
    private static void b(){
        c();

    }

    private static void  c(){

        d();

    }
    private static void d(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.:");
        int a=sc.nextInt();
        System.out.println("enter second no:");
        int b=sc.nextInt();
        int[] arr={1,2,3,4,5};
        try{

            int c=a/b;
            System.out.println(c);
//            System.out.println(arr[0]);
        }
        catch (Throwable throwable){
            System.out.println("Throwable");
            throw throwable;
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
