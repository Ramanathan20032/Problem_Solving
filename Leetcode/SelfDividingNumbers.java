package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers{
    public static void main(String[] args) {
        int right = 47;
        int left = 85;
        List<Integer> result = selfDividingNumbers(right, left);
        System.out.println(result);
    }
    
    static List<Integer> selfDividingNumbers(int right, int left){
        List<Integer> arr = new ArrayList<>();
        for (int i = right ; i <= left ; i++) {
            if(isSelfDividing(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    
    static boolean isSelfDividing(int num){
        int originalNumber = num;

        while (num > 0){
            int rem = num % 10;
            if(rem == 0 || originalNumber % rem != 0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    
}
