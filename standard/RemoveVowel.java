package Standard;

public class RemoveVowel {
    public static void main(String[] args) {
        String input = "Hello, World";
        String vowel = getVowel(input);
        System.out.println(vowel);
    }
    static String getVowel(String str){
        StringBuilder vowel = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(isVowel(c)){
                vowel.append(c);
            }
        }
        return vowel.toString();
    }
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
