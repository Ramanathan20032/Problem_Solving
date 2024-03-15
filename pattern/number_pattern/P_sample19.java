package number_Pattern;

import java.util.Scanner;

public class P_sample19 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}

}
/*

Enter the limit:5
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 

*/