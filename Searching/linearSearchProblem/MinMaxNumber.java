package Searching.linearSearchProblem;

import org.w3c.dom.ls.LSOutput;

public class MinMaxNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("maximum : " + max(arr));
        System.out.println("minimum : " + min(arr));
    }
    //    -----------------------------------------------------------
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
    //   -----------------------------------------------------------
    //assume arr.length != 0
    //return the minimum value in a array
    static int min1(int[] arr) {
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    //    -----------------------------------------------------------
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int element : arr){
           if(element > max){
               max = element;
           }
        }
        return max;
    }
    //    -----------------------------------------------------------
    //assume arr.length != 0
    //return the maximum value in a array
    static int max1(int[] arr) {
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
