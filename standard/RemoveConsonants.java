package Standard;

public class RemoveConsonants {
    public static void main(String[] args) {
        String input = "Hello, World";
        String consonants = getConsonants(input);
        System.out.println(consonants);
    }
    static String getConsonants(String str){
        StringBuilder consonants = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!isConsonants(c)){
                consonants.append(c);
            }
        }
        return consonants.toString();
    }
    static boolean isConsonants(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
