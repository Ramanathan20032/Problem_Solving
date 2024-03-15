package Standard;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int num = sc.nextInt();
        System.out.println(B2D(num));
    }
    static int B2D(int num){
        int sum = 0;
        int base = 2;
        int exponent = 0;

        while(num > 0){
            int digit = num % 10;
            sum = (int) (sum + (digit * Math.pow(base, exponent)));
            num = num / 10;
            exponent++;
        }
        return sum;
    }
}
