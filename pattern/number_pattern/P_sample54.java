package number_Pattern;

import java.util.Scanner;

public class P_sample54 {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit:");
    int n = sc.nextInt();
    for(int i=1,p=1;i<=n;i++,p++) {
    	for(int k=i;k<=n;k++) {
    		System.out.print("  ");
    	}
    	for(int j=1;j<i;j++) {
    		System.out.print(p+" ");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print(p+" ");
    	}
      System.out.println();
      }
    
	}

}
/*

Enter the limit:5
        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 

*/