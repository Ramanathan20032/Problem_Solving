package number_Pattern;

import java.util.Scanner;

public class P_sample7 {
        public static void main(String args[]) {
            Scanner sc =  new Scanner(System.in);	
            System.out.print("enter the limit:");
            int limit = sc.nextInt();
            for(int i=1;i<=limit;i++) {
            	for(int j=1;j<=i;j++) {
            		System.out.print(i+" ");
            	}
               System.out.println();	
            }
          }	

}

/*
enter the limit:5
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/

