package Coding.challenges.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};
        int target=9;
        System.out.println(Arrays.toString(addTwoNumber(arr, target)));

    }

    public static int[] addTwoNumber(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for (int i = 0; i < arr.length ; i++) {
            int num=arr[i];
            int rem=target-num;
            if (map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i){
                    continue;
                }

                return new int[]{arr[i],arr[index]};
            }

        }
        return new int[]{};
    }
}
