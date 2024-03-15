package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample62 {
	 public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the limit:");
		    int n = sc.nextInt();
		    for(int i=1,p='A';i<=n;i++,p+=2) {
		    	for(int j=1;j<=i;j++) {
		    		System.out.print((char)p+" ");
		    	}
		    	System.out.println();
		    }
	    }
}
