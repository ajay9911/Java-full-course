package arrays;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int n=5;
        for (int j : a) {
            System.out.print( j);
            if(j==n){
                System.out.println("No Founded");
            }else{
                System.out.println("Not found");
            }
        }

//        System.out.println();
//        int i=0;
//        while (i<a.length){
//            System.out.print(a[i]);
//            i++;
//
//        }

    }
}
