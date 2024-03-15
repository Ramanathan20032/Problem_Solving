package Standard;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
        fibo1(10);
    }

    static ArrayList<Integer> fibo(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        int result;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            arr.add(a);
            result = a + b;
            a = b;
            b = result;
        }
        return arr;
    }

    static void fibo1(int num){
        int result;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(a+" ");
            result = a + b;
            a = b;
            b = result;
        }
    }
}
