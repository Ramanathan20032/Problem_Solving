package Standard;

import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 5, 4, 2, 65};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
