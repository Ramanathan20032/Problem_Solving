package medium;
// Second-largest number in the Array
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5};
        System.out.println(getSecondLargest(arr));  // 5

    }

    static int getSecondLargest(int[] arr){
        int Largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;  // or -1
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > Largest){
                secondLargest = Largest;
                Largest = arr[i];
            }
            else if (arr[i] < Largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
