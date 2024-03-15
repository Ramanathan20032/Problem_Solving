package Standard;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(logic(6));
    }

    static int logic(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
