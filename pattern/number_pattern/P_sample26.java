package number_Pattern;

import java.util.Scanner;

public class P_sample26 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" "); 
			}
			System.out.println();
		}
	}
}
/*Enter the limit:5
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
*/