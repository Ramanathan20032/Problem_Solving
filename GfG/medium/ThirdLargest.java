package medium;

public class ThirdLargest {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2,2,2,2,5};
        System.out.println(thirdLargest(arr, n));
    }

    static int thirdLargest(int arr[], int n) {
        if (n < 3) {
            return -1;
        }

            int firstLargest = arr[0];
            int secondLargest = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
            if (arr[i] > firstLargest) {
                third = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                third = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > third && arr[i] < secondLargest) {
                third = arr[i];
            }
        }
        return third;
    }
}
