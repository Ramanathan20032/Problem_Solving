package Leetcode;

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeVal(new int[]{3, 2, 2, 3},3));
        System.out.println(removeVal(new int[]{0, 1, 2, 2, 3, 0, 4, 2},2));
    }

    static int removeVal(int[] arr, int val){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val){
                arr[temp] = arr[i];
                temp++;
            }
        }
        return temp;
    }
}
