package DSA;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//      int[] arr = {2, 1, 4, 3, 6, 5};
//      int[] arr = {2, 4, 7, 8, 9, 10};
        convertToWave(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void convertToWave(int[] arr){
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
