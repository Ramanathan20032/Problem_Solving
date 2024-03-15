package star_Pattern;

import java.util.Scanner;
 // hill pattern
public class P_sample30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {      //  decreasing i - n
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {      //  increasing 1 - i
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {      //  increasing 1 - i
				System.out.print("* ");
			}
			System.out.println();
	  }
	}
}
/*
Enter the limit:5
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 


*/