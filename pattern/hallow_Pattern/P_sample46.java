package hallow_Pattern;

import java.util.Scanner;

public class P_sample46 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
              if(j==1 || j==n)         // if(i==1 || i==n)    row parallel
            	  System.out.print("* ");
              else 
            	  System.out.print("  ");  
			}
			System.out.println();
		}

		
	}

}
/*
 Enter the limit:6
*         * 
*         * 
*         * 
*         * 
*         * 
*         * 
 */