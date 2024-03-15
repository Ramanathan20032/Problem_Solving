package easy;

import java.math.BigInteger;
// last digit of the largest Number
public class FindLastDigitOfLargeNumber {
    public static void main(String[] args) {
        String a = "6";
        String b = "2";
        System.out.println(getLastDigit(a, b));
    }

    static int getLastDigit(String a, String b){
        int base = Integer.parseInt(a);
        int exponent = Integer.parseInt(b);

        int result = (int) Math.pow(base, exponent);
        result = result % 10;

        return result;
    }

    static int getLastDigit1(String a, String b) {
        // code here
        BigInteger base = new BigInteger(a);
        BigInteger exponent = new BigInteger(b);

        BigInteger result = base.modPow(exponent, new BigInteger("10"));

        return result.intValue();
    }
}
