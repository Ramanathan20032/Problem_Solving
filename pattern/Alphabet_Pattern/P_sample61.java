package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample61 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
 		for(int i=limit;i>=1;i--) {
			for(int j=i;j<=limit;j++) {
				System.out.format("%c ",i+64);
			}
			System.out.println();
		}
     }
}
