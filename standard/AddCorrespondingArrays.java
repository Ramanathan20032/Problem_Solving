package Z_questions_Interview;

import java.util.Arrays;

public class AddCorrespondingArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        if(arr1.length == arr2.length){
            System.out.println("After addition : " + Arrays.toString(addArray(arr1, arr2)));
        }
        else {
            System.out.println("size of the Array is not equal");
        }
    }
    static int[] addArray(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i] + arr2[i];
        }
        return newArr;
    }
}
