package Leetcode;

public class PrintDuplicateElementOfArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        duplicateElements(arr);
    }

    static void duplicateElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
