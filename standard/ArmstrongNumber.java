package Standard;

import java.util.Scanner;
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        armStrong(num);
    }

    static void armStrong(int num){
        int sum = 0;
        int rem;
        int temp = num;
        int NumberOfDigit = (int) (Math.log10(num) + 1);

        for(int i = 1; i <= NumberOfDigit; i++){
            rem = num % 10;
            sum = (int) (sum + Math.pow(rem,NumberOfDigit));
            num = num / 10;
        }

        if(temp == sum) {
            System.out.println(temp + " is a ArmStrongNumber");
        } else {
            System.out.println(temp + " is not a ArmStrongNumber");
        }
    }
}
