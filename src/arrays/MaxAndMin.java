package arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] a=ArrayUtils.inputArray();

        int max=max(a);
        System.out.println("max:"+max);
        int min=min(a);
        System.out.println("min:"+min);
    }

    public static int max(int[] a){

        int max=a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int min(int[] a){

        int min=a[0];
        for (int j : a) {
            if (min> j) {
                min = j;
            }
        }
        return min;
    }
}
