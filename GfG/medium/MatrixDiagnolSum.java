package medium;

public class MatrixDiagnolSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagnolSum(arr));
        System.out.println(diagnolSum(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }

    static int diagnolSum(int[][] arr){

        int n = arr.length;

        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < n){
            sum = sum + arr[i][j];
            i++;
            j++;
        }

        i = 0;
        j = n - 1;
        while (j >= 0){
            if(i != j){
               sum = sum + arr[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
