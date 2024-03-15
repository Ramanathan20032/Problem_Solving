package medium;
// second-Smallest element in the array
public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5};
        System.out.println(getSecondSmallest(arr));  // 2
    }
    static int getSecondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
