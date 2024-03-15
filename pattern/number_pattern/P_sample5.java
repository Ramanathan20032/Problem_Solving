package number_Pattern;

import java.util.Scanner;

public class P_sample5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=limit;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

 /*
 
  Enter the limit:5
  5 4 3 2 1 
  5 4 3 2 1 
  5 4 3 2 1 
  5 4 3 2 1 
  5 4 3 2 1 

 */