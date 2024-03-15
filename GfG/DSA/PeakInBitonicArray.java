package DSA;
// largest element in a bitonic Array
public class PeakInBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1, 15, 25, 45, 42, 21, 17, 12, 11};
        System.out.println(peak(arr));
    }

    static int peak(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                // you are in the decreasing part
                end = mid;
            }
            else{   // arr[mid] < arr[mid+1]
                // you are in the increasing part
                start = mid + 1;
            }
        }
        return arr[start];  // end  --> start == end
    }
}
