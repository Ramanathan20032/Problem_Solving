package Searching.BinarySearchProblem;

//ceiling of an Array
// find the smallest number which is greater than or equal to target.... //

public class CeillingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(linearCeil(arr, target));
        System.out.println(binaryCiel(arr, target));
    }

    // return index : Smaller number >= target

    //o(n)
    static int linearCeil(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= target){
                return arr[i];
            }
        }
        return -1;
    }
    // o(n logn)
    static int binaryCiel(int[] arr, int target){

        // But if the target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){          // search in Left
                end = mid - 1;
            }
            else if (target > arr[mid]) {   // search in Right
                start = mid + 1;
            }
            else{
                return mid;  // mid element == target
            }
        }
        // next greater element to mid
        return start;     // return arr[start]
    }
}
