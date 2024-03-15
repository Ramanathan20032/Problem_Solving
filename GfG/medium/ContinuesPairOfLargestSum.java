package medium;

public class ContinuesPairOfLargestSum {
    public static void main(String[] args) {
        int[] arr = {0, 6, 4, 3, 3, 0, 7 ,8};
        System.out.println(largestSum(arr));
    }
    static int largestSum(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i+1];
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
