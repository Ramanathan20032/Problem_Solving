package number_Pattern;

import java.util.Scanner;

public class P_sample60_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit:");
		int n = sc.nextInt();
		
		// UpHill Pattern
		for(int i=1;i<=n;i++) {
			int p=1;
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(p+++" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(p--+" ");
			}
		    System.out.println();	
		}
		
	}

}/*
Enter the Limit:5
          1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 

*/
