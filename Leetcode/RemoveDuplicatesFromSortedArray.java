package Leetcode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("The new length of the array is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[uniqueIndex] != arr[i]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
}
