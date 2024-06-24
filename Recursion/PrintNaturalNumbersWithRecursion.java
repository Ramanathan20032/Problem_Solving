package Standard.Recusion;

public class PrintNaturalNumbersWithRecursion {
    public static void main(String[] args) {
        int n = 10;
        naturalNumbers(n);
        System.out.println();
        naturalPrint(n);
    }

    static void naturalPrint(int n){
        if (n == 1) {
            System.out.print(1);
        }
        else {
            naturalNumbers(n - 1);
            System.out.print(n+" ");
        }
    }
}
