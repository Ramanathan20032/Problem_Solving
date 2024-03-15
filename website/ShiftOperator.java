package Website;

public class ShiftOperator {
    public static void main(String[] args) {
//        byte f = (byte)256>>1;
//        byte g = (byte)256<<1;
//        System.out.println(f);
//        System.out.println(g);
        byte f = (byte) 256 >> 1;
        System.out.println(f);
        byte f1 = (byte) (256 >> 1);
        System.out.println(f1);
        byte g = (byte) 256 << 1;
        System.out.println(g);
        byte g1 = (byte) (256 << 1);
        System.out.println(g1);
        System.out.println(00001011 >> 5);
        
    }
}
