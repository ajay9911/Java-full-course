package Coding.problems.power_of_two;

public class Solution {

    public static void main(String[] args) {
        boolean b = isPowerOfTwo(9);
        System.out.println(b);

    }

    public static boolean isPowerOfTwo(int n){
        if (n<0){
            return false;
        }

        while (n>1){
            if (n%2!=0){
                return false;
            }
            n=n/2;
        }


        return true;
    }
}
