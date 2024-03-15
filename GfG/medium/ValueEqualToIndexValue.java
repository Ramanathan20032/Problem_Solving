package medium;

// 1-based indexing. it starts with indices(position) of element start from 1, not 0.

// find the value which is equal to the index
public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        int arr[] = {15, 2, 45, 12, 7};
        System.out.println(logic(arr));
    }

    static int logic(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i+1){
                result = arr[i];
            }
        }
        return result;
    }
}
