package Standard;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "r a m a n a t h a n";
        String str1 = "y o u t h";
        str = str.replaceAll(" ", "");
        System.out.println(str);
        // using "//s"
        str1 =  str1.replaceAll("\\s+","");
        System.out.println(str1);
    }
}
