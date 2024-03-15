package Leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(withoutDuplicatesLength(arr));
    }

    static int withoutDuplicatesLength(int[] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
