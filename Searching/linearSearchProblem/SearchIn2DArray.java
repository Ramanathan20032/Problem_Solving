package Searching.linearSearchProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 15, 23, 45},
                {32, 65, 90},
                {2, 87, 33, 42, 79},
                {54, 88, 91, 3}
        };
        int target = 79;
        int[] ans = search(arr, target);            // format for return value {row, column}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
