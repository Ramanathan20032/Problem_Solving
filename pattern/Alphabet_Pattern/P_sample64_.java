package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample64_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit:");
		int n = sc.nextInt();
		// UpHill Pattern
		for(int i=1;i<n;i++) {
			int p='A';
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print((char)p+++" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)p+++" ");
			}
		    System.out.println();	
		}
		// DownHill Pattern
		for(int i=1;i<=n;i++) {
			int p='A';
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print((char)p+++" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print((char)p+++" ");
			}
		    System.out.println();	
		}
	}
}
/*
 Enter the Limit:5
          A 
        A B C 
      A B C D E 
    A B C D E F G 
  A B C D E F G H I 
    A B C D E F G 
      A B C D E 
        A B C 
          A 

 */