package star_Pattern;

import java.util.Scanner;

public class P_sample31 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n  = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<(n-i)-1;k++) {    // formula for space
				System.out.print("  ");
			}
			for(int j=0;j<(i*2)+1;j++) {    // formula for *
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