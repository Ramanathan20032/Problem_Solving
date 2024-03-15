package Standard;

import java.util.Arrays;

public class ReverseaArray {
    public static void main(String[] args) {
        int[] arr = {1, 790, 370, 9, 154, 89, 153, 371, 153 ,45 ,6 ,23 ,67 ,463};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
