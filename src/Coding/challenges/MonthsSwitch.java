package Coding.challenges;

import java.util.Scanner;

public class MonthsSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month in number");
        int month=sc.nextInt();
        String monthName=getMonthName(month);
        System.out.println(monthName);
    }

    public static String getMonthName(int month) {

        return switch (month){
            case 1->"Jan";
            case 2->"Feb";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"Sept";

            case 10->"Oct";
            case 11->"November";
            case 12->"Dec";
            default ->"Invalid Month";
        };
    }
}
