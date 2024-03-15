package Searching.linearSearchProblem;

public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 15, 23, 45},
                {32, 65, 90},
                {2, 87, 33, 42, 79},
                {54, 88, 91, -3}
        };
    }

    // function to find max numbers
    static int maxFind(int[][] arr){
        int max = Integer.MIN_VALUE;    // -2147483648
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // function to find min numbers
    static int minFind(int[][] arr){
        int min = Integer.MAX_VALUE;    // 2147483648
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}

