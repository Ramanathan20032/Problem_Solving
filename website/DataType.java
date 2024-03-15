package Website;

public class DataType {
    public static void main(String[] args) {
        short a = 3;
        short b = 5;
        Short(a, b);

        byte d = 3;
        byte e = 5;
        Byte(d, e);
    }

    static void Short(int n1, int n2){
        short c = (short) (n1 + n2);
        // can't print without Casting
        System.out.println(c);
    }

    static void Byte(int n1, int n2){
        byte c = (byte) (n1 + n2);
        // can't print without Casting
        System.out.println(c);
    }
}



