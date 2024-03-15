package easy;

public class SumOfFirstNTerms {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfSeries(n));
    }
    static int sumOfSeries(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + cube(i);
        }
        return sum;
    }

    static int cube(int i){
        return i*i*i;
    }
}
