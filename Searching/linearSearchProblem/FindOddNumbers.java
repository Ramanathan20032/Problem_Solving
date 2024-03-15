package Searching.linearSearchProblem;

public class FindOddNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 543, 2, -4476, 801, 44, 1024};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(isOdd(num)){
                count++;
            }
        }
        return count;
    }

    // -----------------------------------------------
    // function to check whether a number contains even digits or not
    static boolean isOdd(int num){
        int numberOfDigits = digits(num);
            if(numberOfDigits % 2 != 0){
                return true;
            }
            return false;
        }

    // -----------------------------------------------
    // short way to count the numbers...
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num) + 1);
     }

    // -----------------------------------------------
    //count number of digits in a number
    static int digits1(int num) {
        if(num < 0) {
            num = num * -1;
        }
        if(num == 0) {
            return 1;
        }
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

