package Searching.linearSearchProblem;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 5, 14, 28};
        int target = 5;
        System.out.println(searching(arr, target, 1, 4));
    }

    // To find the index
    static int searching(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for(int i = start ; i <= end ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
