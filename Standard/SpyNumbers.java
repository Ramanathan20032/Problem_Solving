package Standard;

public class SpyNumbers {
    public static void main(String[] args) {
        System.out.println(isSpy(123));
        System.out.println(isSpy(1243));
        System.out.println(isSpy(9));
    }

    static boolean isSpy(int num){
        int sum = 0;
        int product = 1;

        if(num > 0 && num <= 9){
            return true;
        }

        while (num > 0){
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }

        if (sum == product){
            return true;
        }
        return false;
    }
}
