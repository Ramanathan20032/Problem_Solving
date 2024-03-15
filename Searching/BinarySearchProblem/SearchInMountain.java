//leetcode.com/problems/find-in-mountain-array
package Searching.BinarySearchProblem;

// search in a mountain array

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 6, 4, 2, 0};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int peak = peakInMountain(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = true;
        if(arr[start] > arr[end]){
            isAsc = false;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
