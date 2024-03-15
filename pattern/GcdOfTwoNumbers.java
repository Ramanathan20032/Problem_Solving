package ComplainceCow;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(gcd(98,56));
        System.out.println(gcd1(98,56));
    }
    static int gcd(int a,int b){
        int gcd = 0;
        int small = a < b ? a : b;
        for (int i = 1; i < small; i++) {
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    static int gcd1(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if (a > b){
            return gcd1(a - b, a);
        }
        return gcd1(a, b - a);
    }
}
