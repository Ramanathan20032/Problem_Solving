package Leetcode;

public class ReverseAString {
    public static void main(String[] args) {
        String originalString = "Dream big";
        String reverseString = reverseStr(originalString);

        System.out.println("Original String : " + originalString);
        System.out.println("reversed String : " + reverseString);
    }

    static String reverseStr(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
