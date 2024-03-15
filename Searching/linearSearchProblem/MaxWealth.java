package Searching.linearSearchProblem;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {9,5},
                {13}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum = rowSum + accounts[i][j];
            }
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
