package star_Pattern;

import java.util.Scanner;

public class P_sample32 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number:");
    	int n = sc.nextInt();
    	
    	for(int i=n;i>=1;i--) {
    		for(int k=0;k<(5-i);k++) {  // formula for space
    			System.out.print("  ");
    		}
    		for(int j=0;j<(i*2)-1;j++) {  // formula for *
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
}
/*

Enter the number:5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/