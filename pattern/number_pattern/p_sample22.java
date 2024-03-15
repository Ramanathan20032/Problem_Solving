package number_Pattern;

import java.util.Scanner;

public class p_sample22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 7;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		  }
     }
}

 /*
4
 
7 
6 5 
4 3 2 
1 0 -1 -2 
 */