package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample63_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit:");
		int n = sc.nextInt();
		int p='A';
		// UpHill Pattern
		for(int i=1;i<n;i++,p++) {
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print((char)p+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}
		    System.out.println();	
		}
		// DownHill Pattern
		for(int i=1;i<=n;i++,p++) {
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print((char)p+" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print((char)p+" ");
			}
		    System.out.println();	
		}
	}
}
/*
 Enter the Limit:5
          A 
        B B B 
      C C C C C 
    D D D D D D D 
  E E E E E E E E E 
    F F F F F F F 
      G G G G G 
        H H H 
          I 

 */