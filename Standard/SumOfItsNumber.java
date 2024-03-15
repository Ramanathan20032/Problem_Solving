package Standard;

public class SumOfItsNumber {
    public static void main(String[] args) {
        System.out.println(sum(45436));
    }
    static int sum(int n){
        int sum = 0;
        int rem;
        while (n > 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}
