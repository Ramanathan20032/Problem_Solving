package Leetcode;

import java.util.Arrays;

public class ConcatenationOfTwoArrays {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(Concatenation(nums)));
    }
    static int[] Concatenation(int[] nums){
        int[] arr = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
}
