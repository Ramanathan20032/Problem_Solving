package Standard;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        swap(a, b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    static void swap1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
