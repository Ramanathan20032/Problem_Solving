package Leetcode1;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {3, -4, 1, -3, 5, -1, 4, -2};
        System.out.println("Maximum sum of SubArray : "+maxSubArray(arr));
    }
    static int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum = Math.max(currentSum+arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
