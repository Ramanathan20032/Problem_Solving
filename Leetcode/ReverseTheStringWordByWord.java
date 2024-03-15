package Leetcode;

public class ReverseTheStringWordByWord {
    public static void main(String[] args) {
        String originalString = "Welcome to programming";
        String reverseString = reverseStringWordByWord(originalString);

        System.out.println("Original String : " + originalString);
        System.out.println("Reversed String : " + reverseString);
    }

    static String reverseStringWordByWord(String str){
        String[] words = str.split("\\s+");

        int start = 0;
        int end = words.length - 1;

        while (start < end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }

        String reversed = String.join(" ",words);
        return reversed;
    }
}
