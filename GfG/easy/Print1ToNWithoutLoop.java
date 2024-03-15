package easy;
// print 1 to N without the loop
public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }

    static void printNos(int n){
        if(n > 0){
            printNos(n - 1);
            System.out.print(n+" ");
        }
    }
}
