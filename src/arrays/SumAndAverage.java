package arrays;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int[] a=ArrayUtils.inputArray();

        int sum=sum(a);
        System.out.println(sum);

        float avg=average(a);
        System.out.println(avg );
    }

    public static int sum(int[] a){
        int sum=0;
        for (int i:a){
            sum=sum+i;
        }
        return sum;
    }

    public static float average(int[] a){
        int sum=sum(a);
        return (float) sum /a.length;
    }
}
