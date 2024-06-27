package Standard;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {43, 54, 76, 54, 23, 2};
        System.out.println(Minimum(arr));
    }
    static int Minimum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
