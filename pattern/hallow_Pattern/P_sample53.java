package hallow_Pattern;

import java.util.Scanner;
// hallow butterfly
public class P_sample53 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
        //up
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
				System.out.print("* ");
				else
			    System.out.print("  ");
			}
			
			for(int k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int k=i;k<n;k++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
				System.out.print("* ");
				else
			    System.out.print("  ");
			}
			System.out.println();
		}
		//down
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				if(j==i || j==n)
				System.out.print("* ");
				else
			    System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				if(j==i || j==n)
				System.out.print("* ");
				else
			    System.out.print("  ");
			}
			System.out.println();
		}
		
	}


}
/*
 Enter the limit:5
 
*                 * 
* *             * * 
*   *         *   * 
*     *     *     * 
*       * *       * 
*     *     *     * 
*   *         *   * 
* *             * * 
*                 * 

*/