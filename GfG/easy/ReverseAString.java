package easy;

public class ReverseAString {
    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.println(reverse(S));
    }

    static String reverse(String s){
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = charArr.length - 1;

        while(start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;

            start++;
            end--;
        }
        return new String(charArr);
    }

}
