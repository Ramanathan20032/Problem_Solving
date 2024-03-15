package easy;
// sum of the element in a matrix
public class SumOfElementInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1},
                {-8, 9, -2}
        };
        System.out.println(sumOfElement(arr));
    }

    static int sumOfElement(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
