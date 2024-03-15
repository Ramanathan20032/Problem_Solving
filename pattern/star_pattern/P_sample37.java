package star_Pattern;

import java.util.Scanner;
//reverse pyramid
public class P_sample37 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the limit:");
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
   }  
}
/*
 
 Enter the limit:5
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

 */