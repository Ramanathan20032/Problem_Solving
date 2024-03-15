package star_Pattern;

import java.util.Scanner;

public class P_sample27 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
	}
}
/*
Enter the limit:5
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

 */