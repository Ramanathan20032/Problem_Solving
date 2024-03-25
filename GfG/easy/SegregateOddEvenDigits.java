package easy;

import java.util.Scanner;

public class SegregateOddEvenDigits {
    public static void main(String[] args) {
        int rem;
        int even = 0;
        int odd = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        while (n > 0){
            rem = n % 10;
            if (rem % 2 == 0){
                even = even * 10 + rem;
            }
            else{
                odd = odd * 10 + rem;
            }
            n = n / 10;
        }
        while (odd > 0){
            rem = odd % 10;
            result = result * 10 + rem;
            odd = odd / 10;
        }
        while (even > 0){
            rem = even % 10;
            result = result * 10 + rem;
            even = even / 10;
        }

        System.out.println(result);
    }
}
