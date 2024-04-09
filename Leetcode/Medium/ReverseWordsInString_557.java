package Leetcode.Medium;

public class ReverseWordsInString_557 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(String word : words){
            reversed.append(reverseWord(word)).append(" ");
        }
        return reversed.toString().trim();
    }
    static String reverseWord(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}