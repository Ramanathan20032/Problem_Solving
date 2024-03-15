package Leetcode;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "Welcome to java Programming";
        System.out.println(lastWord(s));
    }
    static int lastWord(String s){
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}
