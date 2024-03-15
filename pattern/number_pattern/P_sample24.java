package number_Pattern;
// Right Traingle
import java.util.Scanner;

public class P_sample24 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) { // row
			for(int k=n;k>i;k--) { // space
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) { // column
				System.out.print(j+" "); 
			}
			System.out.println();
		}
	}
}
/*
Enter the limit: 5 
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5

*/