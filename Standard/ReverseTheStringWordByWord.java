package Standard;

public class ReverseTheStringWordByWord {
    public static void main(String[] args) {
        String originalString = "Welcome to programming";
        String reverseString = reverseStringWordByWord(originalString);

        System.out.println(originalString);
        System.out.println(reverseString);
    }

    static String reverseStringWordByWord(String str){

        String[] words = str.split("\\s+");

        int i = 0;
        int j = words.length - 1;
        while (i < j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }
        String reversed = String.join(" ",words);

        return reversed;
    }
}
