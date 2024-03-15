package Standard;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 13;
        oddEven1(n);
    }

    static void oddEven(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }

    /*
        2 - 0010    even number has the least significant bit as 0
        3 - 0011     odd number has the least significant bit as 1
        4 - 0100
        5 - 0101
        ....
        10 - 1010
        11 - 1011

        ((n & 1) == 0) --- even
        ((n & 1) == 1) --- odd
    */
    static void oddEven1(int n){
        if((n & 1) == 0){
            System.out.println("is even");
        }
        else {
            System.out.println("is odd");
        }
    }

    static void oddEven2(int n){
        String[] arr = {"even","odd"};
        System.out.println(arr[n & 1]);
    }
}
