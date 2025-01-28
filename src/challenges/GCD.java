package challenges;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int m=sc.nextInt();

        System.out.print("enter first no:");
        int n=sc.nextInt();

        int gcd=gcd(m,n);

        System.out.println(gcd);
    }

    public static int gcd(int m,int n) {

        int gcd=1;
        int i=2;
        int least =smallest(m,n);
        while(i<=least){

            if(m %i==0 && n%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;

    }

    public static int smallest(int m,int n){
        return Math.min(m,n);
    }
}
