package number_Pattern;

import java.util.Scanner;

public class P_sample55 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the limit:");
	    int n = sc.nextInt();
	    for(int i=1,p=5;i<=n;i++,p--) {
	    	for(int k=1;k<=i;k++) {
	    		System.out.print("  ");
	    	}
	    	for(int j=i;j<n;j++) {
	    		System.out.print(p+" ");
	    	}
	    	for(int j=i;j<=n;j++) {
	    		System.out.print(p+" ");
	    	}
	    	System.out.println();
	    }
	} 

}
/*
Enter the limit:5
5 5 5 5 5 5 5 5 5 
  4 4 4 4 4 4 4 
    3 3 3 3 3 
      2 2 2 
        1 
*/
