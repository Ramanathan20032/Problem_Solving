package easy;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 200;
        System.out.println(reverse(num));
    }

    static int reverse(int num){
        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        return reversed;
    }
}
