package Website;

class A{
    // - protected modifier
    protected void msg(){
        System.out.println("hello");
    }
}

class B extends A{
      // - default modifier
//    void msg(){
//        System.out.println("hi");
//    }
}
public class AccessModifierOverriding {
    public static void main(String[] args) {
//  protected modifier > default modifier
//  /it is not possible to override the "protected" to "default"
        B b = new B();
        b.msg();
    }
}
