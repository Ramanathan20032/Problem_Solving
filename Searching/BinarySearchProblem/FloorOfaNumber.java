package Searching.BinarySearchProblem;

//Floor of an array
//find the Biggest number which is smaller than or equal to target.... //

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        System.out.println(linearFloor(arr, target));
        System.out.println(binaryFloor(arr, target));
    }

    //return the index : greatest number <= target

    //o(n)
    static int linearFloor(int[] arr, int target){
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            if(arr[i] <= target){
                return arr[i];
            }
        }
        return -1;
    }

    //o(n logn)
    static int binaryFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){               // search in Left
                end = mid - 1;
            }
            else if(target > arr[mid]){         // search in Right
                start = mid + 1;
            }
            else{
                return mid;   // mid element == target
            }
        }
        // next Smaller element to mid
        return end;     // arr[end]
    }
}
