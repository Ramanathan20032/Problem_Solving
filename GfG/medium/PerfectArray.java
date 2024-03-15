package medium;

public class PerfectArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};   // perfect
//      int arr1[] = {1, 2, 3, 4, 5};   // imperfect
        System.out.println(isPerfect(arr));
    }

    static boolean isPerfect(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
