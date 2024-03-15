package Standard;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        int a = 90;
        int b = 70;
        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b){
        int gcd = 0;
        int small = a < b ? a : b;
        for (int i = 1; i <= small; i++) {
            if(a % i == 0  &&  b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
