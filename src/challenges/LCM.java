package challenges;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int m=sc.nextInt();

        System.out.print("enter first no:");
        int n=sc.nextInt();

        int lcm=lcm(m,n);

        System.out.println(lcm);
    }

    public static int lcm(int m,int n) {

        int i=1;
        while(true){
            int factor=m*i;
            if(factor%n==0){
                return factor;
            }
            i++;
        }

//        return 0;
    }
}
