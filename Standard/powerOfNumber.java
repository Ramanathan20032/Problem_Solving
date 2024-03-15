package Standard;

public class powerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        System.out.println(power1(base, exponent));
    }
    static int power(int base, int exponent){
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    static int power1(int base, int exponent){
        int result = 1;
        while(exponent > 0){
            result = result * base;
            exponent--;
        }
        return result;
    }
}
