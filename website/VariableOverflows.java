package Website;

public class VariableOverflows {
    public static void main(String[] args) {
        int a = -135;
        byte b = (byte) a;
        System.out.println("Original int value: " + a);
        System.out.println("Converted byte value: " + b);


    }
}


//byte range = -128 to 127 = 256
//a = -145 && b = +111 ---> 256 % 145
//a = +135 && b = -121 ---> 256 % 135