package Standard;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.print("Enter the year : ");
            int year = sc.nextInt();
            isLeap(year);
        }
    }

    static void isLeap(int year){
        if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ){
            System.out.println(year + " is leap year..");
        }
        else {
            System.out.println(year + " is not a leap year..");
        }
    }
}
