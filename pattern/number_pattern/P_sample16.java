package number_Pattern;

import java.util.Scanner;

public class P_sample16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=limit;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}


}
/*
Enter the limit:5
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 

*/