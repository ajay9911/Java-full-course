package Coding.practice.practice2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year");
        int year=sc.nextInt();

        if(year % 400==0 || (year %4==0 && year%100!=0)){
            System.out.println("leap year");

    }
//        else if () {
//            System.out.println("Not leap Year");
//
//        }
//        else if (){
//            System.out.println("leap year");
//        }
        else {
            System.out.println("not lear");
        }

    }
}
