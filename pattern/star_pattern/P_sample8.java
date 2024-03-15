package star_Pattern;

import java.util.Scanner;

public class P_sample8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
	}

}

/*

Enter the limit:5
* 
* * 
* * * 
* * * * 
* * * * * 

*/