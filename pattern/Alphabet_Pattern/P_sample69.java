package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample69 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the String:");
		    String s = sc.next();
		    for(int i=1,k=4;i<=s.length();i++,k--) {
		    	int p = k;
		    	for(int j=1;j<=i;j++) {
		    		System.out.print(s.charAt(p--)+" ");
		    	}
		    	System.out.println();
		    }
		}
}
