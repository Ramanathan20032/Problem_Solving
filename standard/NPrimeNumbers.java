package Standard;

import java.util.Scanner;

public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        NPrime(num);
    }

    static void NPrime(int num){
        int div;
        for (int i = 2; i <= num; i++) {
            for(div = 2; div < i; div++){
                if(i % div == 0){
                    break;
                }
            }
            if(div == i){
                System.out.print(i+" ");
            }
        }
    }
}
