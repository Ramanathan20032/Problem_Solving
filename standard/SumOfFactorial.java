package Standard;

public class SumOfFactorial {
    public static void main(String[] args) {
        int num = 11;
        logic(num);
    }

    static void logic(int num){
        int rem;
        int temp = num;
        int sum = 0;
        while (num > 0){
            rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }
        if (temp == sum){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not a strong number");
        }
    }

    static int fact(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }
}
