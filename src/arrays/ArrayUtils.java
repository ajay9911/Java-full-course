package arrays;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.print("enter "+size+"element of array");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
}
