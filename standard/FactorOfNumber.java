package Standard;

import java.util.ArrayList;

public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.println(factor(100));
        factor1(100);
    }

    static ArrayList<Integer> factor(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                arr.add(i);
            }
        }
        return arr;
    }

    static void factor1(int num){
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
