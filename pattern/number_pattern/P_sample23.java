package number_Pattern;

import java.util.Scanner;

public class P_sample23 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = 7;
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
	}
}

/*

7 
6 5 
4 3 2 
1 0 -1 -2 
-3 -4 -5 -6 -7 

 */