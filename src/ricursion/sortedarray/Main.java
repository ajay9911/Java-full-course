package ricursion.sortedarray;

public class Main {
    public static void main(String[] args) {

        int[] arr={9};
        System.out.println(isSorted(arr,arr.length));
    }

    public static boolean isSorted(int[] arr ,int n){
        if (n==0||n==1){
            return true;
        }

        return arr[n-1]>=arr[n-2] && isSorted(arr,n-1);
    }
}
