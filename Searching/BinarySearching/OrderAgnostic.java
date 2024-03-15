package Searching.BinarySearching;

public class OrderAgnostic {
    public static void main(String[] args) {
    // Array must be Sorted
    // for Descending order
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        System.out.println(binarySearching(arr, 75));
        System.out.println(binarySearching(arr, 7));
    }

    // return the index
    //return -1 if it does not exist
    static int binarySearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
