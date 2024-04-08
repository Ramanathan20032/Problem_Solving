package Leetcode1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 6, 3};
        int target = 13;
        int[] result = sum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] sum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
}
