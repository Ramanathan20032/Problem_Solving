package Website;

class calculator{
    void add(int a, int b){
        System.out.println(a+b);
    }
}
public class AnonymesObject {
    public static void main(String[] args) {
        // Anonymes Object
        new calculator().add(6,8);
    }
}
