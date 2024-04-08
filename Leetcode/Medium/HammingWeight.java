package Leetcode1;

public class HammingWeight {
    public static void main(String[] args) {
        int n = 128;
        System.out.println("Count of 1's in Binary Number of " + n + " : " + hammingWeight(n));
    }

    static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i <= 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

