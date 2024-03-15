 package number_Pattern;

import java.util.Scanner;

public class P_sample21 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k=1;
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((k++)%2+" ");
				//k++;
			}
			System.out.println();
		}
	}

}
/*
Enter the limit:5
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 
*/