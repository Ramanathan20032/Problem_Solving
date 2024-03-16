package Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {-1, 7, -32, 0, 89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {100, 0, -42, 2, 66};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {4, 5, 1, 2, 3};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    // bubble sort
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    // selection sort
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    // insertion sort
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
