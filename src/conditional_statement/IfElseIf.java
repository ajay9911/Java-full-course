package conditional_statement;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if (marks>=60){
            System.out.println("First");
        } else if (marks>=50) {
            System.out.println("Second");

        }

        else if (marks>=33 ) {
            System.out.println("Third");

        }
        else {
            System.out.println("Fail");
        }


    }


}
