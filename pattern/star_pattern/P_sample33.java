package star_Pattern;

import java.util.Scanner;

public class P_sample33 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the limit:");
	int n = sc.nextInt();
	   for(int i=1;i<=n;i++) {
		   for(int k=1;k<i;k++) {
			   System.out.print("  ");  // inc 1 - i
		   }
		   for(int j=i;j<n;j++) {       // dec i - n
			   System.out.print("* ");
		   }
		   for(int j=i;j<=n;j++) {      // dec i - n 
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	}
}
/*

Enter the number:5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/