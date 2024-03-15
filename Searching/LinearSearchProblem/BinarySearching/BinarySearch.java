package Searching.BinarySearching;

public class BinarySearch {
    public static void main(String[] args) {
    // Array must be sorted
    // For Ascending Order
        int[] arr = {11, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(binarySearching(arr, 34));
        System.out.println(binarySearching(arr,57));
    }

    // return the index
    //return -1 if it does not exist
    static int binarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // mid element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){              // search in left
                end = mid - 1;
            }
            else if (target > arr[mid]) {       // search in right
                start = mid + 1;
            }
            else{
                return mid;                     // answer
            }
        }
        return -1;
    }
}
