package Z_questions_Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10, 7, 14, 5, 8, 3, 12};
        int[] result = evenArray(arr);
        System.out.println("Even Array : " + Arrays.toString(result));
        System.out.println("Minimum Number from the Array : " + minimum(result));
    }
    static int[] evenArray(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
    static int minimum(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
