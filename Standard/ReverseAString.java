package Standard;

public class ReverseAString {
    public static void main(String[] args) {
        String originalString = "Geeks for Geeks";

        System.out.println("Original String : " + originalString);
        System.out.println("reversed String : " + reverse(originalString));
        System.out.println("reversed String : " + reverseStr(originalString));
    }

    static String reverseStr(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    static String reverse(String str){
        char[] s = str.toCharArray();

        int start = 0;
        int end = s.length - 1;

        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
        return new String(s);
    }
}
