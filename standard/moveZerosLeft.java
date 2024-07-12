package Standard;

import java.util.Arrays;

public class moveZerosLeft {
    public static void main(String[] args) {
        int[] arr = {4, 6, 0, 9, 0, 3, 0, 0};
        System.out.println("Original array : " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("Modified zeros to left : " + Arrays.toString(arr));
    }
    static void moveZeros(int[] arr){
        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != 0){
                arr[index] = arr[i];
                index--;
            }
        }
        for (int i = index; i >= 0; i--) {
            arr[i] = 0;
        }
    }
}
