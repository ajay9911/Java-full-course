package challenges;

import java.util.Scanner;

public class SumOfAllOddNumbers {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();

        int sum=sumOfAllOddNumbers(n);
        System.out.println(sum);

    }

    public static int sumOfAllOddNumbers(int n){
        int sum=0;
        for (int i=0;i<=n;i++){

            if (i%2!=0){
                sum=sum+i;
            }

        }

        return sum;
    }
}
