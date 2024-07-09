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
        int length = arr.length;
        int[] newArr = new int[length];
        int index = length - 1;

        for (int i = length - 1; i >= 0; i--) {
            if(arr[i] != 0){
                newArr[index] = arr[i];
                index--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}