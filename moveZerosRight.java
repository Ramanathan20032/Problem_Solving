package Standard;

import java.util.Arrays;

public class moveZerosRight {
    public static void main(String[] args) {
        int[] arr = {4, 6, 0, 9, 0, 3, 0, 0};
        System.out.println("Original array : " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("Modified zeros to right : " + Arrays.toString(arr));
    }
    static void moveZeros(int[] arr){
        int length = arr.length;
        int[] newArr = new int[length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}
