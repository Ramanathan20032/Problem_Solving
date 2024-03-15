package number_Pattern;

import java.util.Scanner;

public class P_sample56 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the limit:");
	    int n = sc.nextInt();
	    for(int i=1,p=0;i<=n;i++,p+=2) {
	    	for(int j=1;j<=i;j++) {
	    		    System.out.print(p+" ");
	    	}
	    	System.out.println();
	    }

	}

}
/*

Enter the limit:5
0 
2 2 
4 4 4 
6 6 6 6 
8 8 8 8 8 
*/