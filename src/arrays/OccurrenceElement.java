package arrays;

import java.util.Scanner;

public class OccurrenceElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=ArrayUtils.inputArray();
        System.out.print("enter a number that you want to find");
        int n=sc.nextInt();

        int noOfOccurrences= noOfOccurrences(a,n);
        System.out.println("no of noOfOccurrences:"+noOfOccurrences);

    }

    public static int noOfOccurrences(int[] a, int num){

        int occurrences=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==num){
                occurrences++;
            }
        }
        return occurrences;
    }
}
