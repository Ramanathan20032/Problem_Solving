package easy;

// n is divisible by it digits and leaves a remainder.

public class CountDigitsDivideANumber {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(evenlyDivides(n));
    }

    static int evenlyDivides(int n){
        int count = 0;
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            if(temp % digit == 0 && digit != 0){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
