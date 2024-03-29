package Standard;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start index : ");
        int start = sc.nextInt();
        System.out.print("Enter the end index : ");
        int end = sc.nextInt();

        int div;
        for (int i = start; i <= end; i++) {
            for (div = 2; div < i; div++) {
                if (i % div == 0){
                    break;
                }
            }
            if (div == i){
                System.out.print(i + " ");
            }
        }

    }
}
