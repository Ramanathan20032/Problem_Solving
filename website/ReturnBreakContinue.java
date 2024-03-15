package Website;

public class ReturnBreakContinue {
    public static void main(String[] args) {
        int n = 10;
        Return(n);
        System.out.println();
        Break(n);
        System.out.println();
        Continue(n);
        System.out.println();
    }

    static void Return(int n){
        for (int i = 1; i <= n; i++) {
            if(i == 3){
                return;
            }
            System.out.print(i+" ");
        }
    }

    static void Break(int n){
        for (int i = 1; i <= n; i++) {
            if(i == 3){
                return;
            }
            System.out.print(i+" ");
        }
    }

    static void Continue(int n){
        for (int i = 1; i <= n; i++) {
            if(i == 3){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
