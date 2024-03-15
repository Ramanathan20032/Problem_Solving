package DSA;

import java.util.Arrays;

public class FindStartEndIndexOfKey {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndex1(new int[]{ 1, 5, 5, 5, 5, 5 },5)));
        System.out.println(Arrays.toString(findIndex1(new int[]{6, 5, 4, 3, 1, 2},4)));
    }

    static int[] findIndex(int[] arr, int key){
        int start = -1;
        int end = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                start = i;
                break;
            }
        }
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(arr[i] == key){
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }

    static int[] findIndex1(int[] arr, int key){
        int[] ans = {-1, -1};

        int start = search(arr, key, true);
        int end = search(arr, key, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(firstIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
