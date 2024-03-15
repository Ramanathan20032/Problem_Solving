package number_Pattern;

import java.util.Scanner;

public class P_sample13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++){
			for(int j=i;j<=limit;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}


}
/*
Enter the limit:5
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 

*/