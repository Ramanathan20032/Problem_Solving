package easy;
// is the number is a power of 2
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        while (n > 1){
            if(n % 2 != 0){   // 2 --> 3 isPowerOfTwo()
                return false;
            }
            n /= 2;           // 2 --> 3
        }
        return true;
    }
}
