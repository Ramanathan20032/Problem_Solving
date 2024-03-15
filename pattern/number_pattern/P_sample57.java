package number_Pattern;

import java.util.Scanner;

public class P_sample57 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the limit:");
	    int n = sc.nextInt();
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		if(i%2==0)
	    		    System.out.print("1 ");
	    		else
	    			System.out.print("2 ");
	    	}
	    	System.out.println();
	    }

	}
}
/*
 Enter the limit:5
2 
1 1 
2 2 2 
1 1 1 1 
2 2 2 2 2 

 */