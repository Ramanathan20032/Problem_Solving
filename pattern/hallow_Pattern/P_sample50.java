package hallow_Pattern;

import java.util.Scanner;
// hallow hill pattern
public class P_sample50 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {      //  decreasing i - n
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {      //  increasing 1 - i
				if(i==n || j==1)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
			for(int j=1;j<=i;j++) {      //  increasing 1 - i
				if(i==n || j==i)
				System.out.print("* ");
				else 
				System.out.print("  ");
			}
			System.out.println();
	  }
	}
}
/*
 
 Enter the limit:7
            * 
          *   * 
        *       * 
      *           * 
    *               * 
  *                   * 
* * * * * * * * * * * * * 


 */