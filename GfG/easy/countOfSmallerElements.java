package easy;
// count of elements which is smaller than given element.
public class countOfSmallerElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 5, 7, 9};
        int x = 2;
        System.out.println(count(arr, x));  // 4
    }

    static int count(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= x){
                count++;
            }
        }
        return count;
    }
}
