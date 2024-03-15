package star_Pattern;

import java.util.Scanner;

public class P_sample34 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n+i;j++) {
				if(j<n-i-1) {
					System.out.print("  ");         //without using 3rd variable
				}
				else {
					System.out.print("* ");
				}	
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