package Leetcode1;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str = "pqppqrr";
        System.out.println("Length of the Longest SubString : " +longestSubString(str));
    }
    static int longestSubString(String str){
        int maxLength = 0;
        StringBuilder currentString = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            int currentIndex = currentString.indexOf(String.valueOf(str.charAt(i)));
            if(currentIndex != -1){
                currentString.delete(0, currentIndex + 1);
            }
            currentString.append(str.charAt(i));
            maxLength = Math.max(maxLength, currentString.length());
        }
        return maxLength;
    }
}
