package Standard;

public class swapTwoNumbers {
    public static void main(String[] args) {
        swap(2, 3);
        System.out.println("-----------------");
        swap1(4, 5);
        System.out.println("-----------------");
        swap2(6, 7);
    }
    
    static void swap(int a, int b){
        System.out.println("a : " + a + " " + "b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " " + "b: " + b);
    }
    static void swap1(int a, int b){
        System.out.println("a : " + a + " " + "b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " " + "b: " + b);
    }
    static void swap2(int a, int b){
        System.out.println("a : " + a + " " + "b: " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a : " + a + " " + "b: " + b);
    }
}
