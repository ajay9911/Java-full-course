package loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
//        while (age<0 || age>100){
//            System.out.println("Enter age");
//           age=sc.nextInt();
//        }

        do{
            System.out.println("Enter age");
            age=sc.nextInt();

        } while (age<0 || age>100);
        System.out.println("Age:"+age);
    }
}
