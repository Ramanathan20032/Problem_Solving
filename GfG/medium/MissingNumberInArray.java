package medium;

import org.w3c.dom.ls.LSOutput;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int[] arr1 = {6 ,1 ,2 ,8 ,3 ,4 ,9 ,10 ,5};
        // from 0 - n
        System.out.println(missingNumber(arr)); // 2
        // from 1 - n
        System.out.println(missingNumber1(arr1)); // 7
    }

    static int missingNumber(int[] arr){    // 0 - n
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for(int num : arr){
            arraySum = arraySum + num;
        }
        return totalSum - arraySum;
    }

    static int missingNumber1(int[] arr1){    // 1 - n
        int n = arr1.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for(int num : arr1){
            arraySum = arraySum + num;
        }
        return totalSum - arraySum;
    }
}
