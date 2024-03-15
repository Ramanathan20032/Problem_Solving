package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample68 {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the String:");
	    String s = sc.next();
	    for(int i=1,p=0;i<=s.length();i++,p++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(s.charAt(p)+" ");
	    	}
	    	System.out.println();
	    }
	}

}
