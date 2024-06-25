package LeetCode;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
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
        HashSet<Integer> seen = new HashSet<>();
        int uniqueIndex = 0;
        for (int i = 0; i < arr.length; i++) {
           if(!seen.contains(arr[i])){
               seen.add(arr[i]);
               arr[uniqueIndex] = arr[i];
               uniqueIndex++;
           }
       }
       return uniqueIndex;
   }
}
