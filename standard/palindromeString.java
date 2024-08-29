package standard;

public class palindromeString {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = input.equals(pal(input));
        System.out.println("Is the given String is palindrome : " + isPalindrome);
    }
    static String pal(String input){
        char[] c = input.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return new String(c);
    }
}
