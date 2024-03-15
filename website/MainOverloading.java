package Website;

public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("This is standard main Method");
        System.out.println("------------------------------------------");
        main("hi", "hello");
    }

    public static void main(String args1, String args2){
        System.out.println("Overloaded method with different parameter");
        System.out.println("Argument 1 : " + args1);
        System.out.println("Argument 2 : " + args2);
    }
}
