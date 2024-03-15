package Website;

public class logicalVsBitwise {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        AndOperator(a, b, c);
        System.out.println("---------------------------------");
        OrOperator(a, b, c);

    }
    static void AndOperator(int a, int b, int c){
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }
    static void OrOperator(int a, int b, int c){
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b | a < c);//true | true = true
        //|| vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }
}
