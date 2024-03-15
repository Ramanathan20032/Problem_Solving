package Standard;

public class SumOfFactors {
    public static void main(String[] args) {
        int num = 6;
        int temp = num;
        if(factorSum(num) == temp){
            System.out.println(num + " is a perfect Number");
        }
        else {
            System.out.println(num + " is not a perfect Number");
        }
    }

    static int factorSum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
