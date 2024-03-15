package star_Pattern;
// Right traingle
import java.util.Scanner;

public class P_sample25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print("  ");
			}
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