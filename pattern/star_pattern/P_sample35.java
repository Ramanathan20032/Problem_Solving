package star_Pattern;

import java.util.Scanner;

public class P_sample35 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit:");
		int n = sc.nextInt();
		// UpHill Pattern
		for(int i=1;i<n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		    System.out.println();	
		}
		// DownHill Pattern
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
		    System.out.println();	
		}
	}

}
/*
 Enter the Limit:5
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 

 */
