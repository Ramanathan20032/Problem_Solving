package medium;

// 1-based indexing. it starts with indices(position) of element start from 1, not 0.

// find the value which is equal to the index
public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        int[] arr = {15, 2, 34, 4, 22};
        System.out.println(equalToIndex(arr));
    }
    static ArrayList<Integer> equalToIndex(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i + 1){
                 result.add(arr[i]);
            }
        }
        return result;
    }
}
