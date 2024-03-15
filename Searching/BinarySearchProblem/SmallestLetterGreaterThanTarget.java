//leetcode.com/problems/find-smallest-letter-greater-than-target/
package Searching.BinarySearchProblem;

// Equal to the approach of ceil of the array
// Ignore the target = number . only greater i.e(mid == target)
// if : arr = [c , d, f, j] , target = j  , answer = c

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];  // start - nextElement // end - previousElement
        // wrapping the array.
    }
}
