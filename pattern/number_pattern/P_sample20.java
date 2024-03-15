package number_Pattern;

import java.util.Scanner;

public class P_sample20 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k=1;
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((k++)+" ");
				//k++;
			}
			System.out.println();
		}
	}
}
/*
Enter the limit:5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/