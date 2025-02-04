package Coding.practice.practice1;

public class X {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6,7,8,9};
        int target = 15;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (target == a[i] + a[j]) {
                    System.out.println("["+a[i] + "," + a[j]+"]");
                }
            }
        }
    }
}
