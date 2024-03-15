package Searching.linearSearching;

public class IntegerSearch {
    public static void main(String[] args) {
        int[] arr = {11, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(linearSearching(arr, 78));
        System.out.println(linearSearching1(arr,99));
    }

    // to find the index
    static int linearSearching(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // to find element by forEach(boolean)
    static boolean linearSearching1(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
