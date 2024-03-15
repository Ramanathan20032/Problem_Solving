package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++){
			  for(int j=1;j<=i;j++){
				System.out.format("%c ",j+64);
			}
		System.out.println();	
		}
	}

}

/*

Enter the limit:5
A 
A B 
A B C 
A B C D 
A B C D E 

*/