package Alphabet_Pattern;

import java.util.Scanner;

public class P_sample67 {
    public static  void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the limit:");
    	int n = sc.nextInt();
    	for(int i=1,y='E';i<=n;i++,y--) {
    		int p = y;
    		for(int k=1;k<=i;k++) {
    			System.out.print(" ");
    		}
    		for(int j=i;j<=n;j++) {
    			System.out.print((char)p--+"");
    		}
    		System.out.println();
    	}
    }
}
