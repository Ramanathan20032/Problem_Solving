package star_Pattern;

import java.util.Scanner;
//double hill
public class P_sample36 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {                          //dec 
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {                          //inc
				System.out.print("* ");
			}
			for(int k=i;k<n;k++) {                          //dec
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {                          //inc
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
/*
 Enter the limit:5
     *         * 
    * *       * * 
   * * *     * * * 
  * * * *   * * * * 
 * * * * * * * * * * 
 
 */

