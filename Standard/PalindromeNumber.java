package Standard;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;
        logic(num);
    }

    static void logic(int num){
        int temp = num;
        int rev = 0;
        int rem;
        while (num > 0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if(temp == rev){
            System.out.println(temp + " is a palindrome");
        }
        else{
            System.out.println(temp + " is not a palindrome");
        }
    }
}
