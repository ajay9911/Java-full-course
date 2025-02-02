package recursion.binarysearch;

public class Main {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,};
        int target=5;

        binarySearch(arr,target);

    }

    public static void binarySearch(int[] arr,int target){

        int b=binary(arr,target,0,arr.length-1);
        System.out.println(b);

    }

    public static int binary(int[] arr,int target, int start,int end) {

        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                return binary(arr, target, mid + 1, end);
            } else {
                binary(arr, target, start, mid - 1);
            }



        }
        return -1;
    }


}
