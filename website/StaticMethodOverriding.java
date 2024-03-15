package Website;

class parent{
    static void method(){
        System.out.println("Static Method in parent class");
    }
}
class child extends parent{
    static void method(){
        System.out.println("Static Method in child class");
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {
        parent.method();
        child.method();
    }
}
