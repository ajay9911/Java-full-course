package practice.practice2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature into F");
        float f= sc.nextFloat();
        float c=(f-32)*5.0f/9.0f;
        System.out.println(c);

    }
}
