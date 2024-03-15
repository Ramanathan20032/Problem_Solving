package Website;

public class ForBreakContinue {
    public static void main(String[] args) {
        int n = 10;
        Break(n);
        System.out.println();
        Continue(n);
    }

    static void Break(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            break;
        }
    }
    static void Continue(int n){
        for (int i = 1; i <= n;) {
            i++;
            if(i==3){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
