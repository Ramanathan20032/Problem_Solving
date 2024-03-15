package Standard.Recusion;

public class PowerOfNumberUsingRecursion {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(power(base, exponent));
    }

    static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        else{
            return (base * power(base, exponent-1));
        }
    }
}
