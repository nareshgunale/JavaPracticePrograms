package PatternPrograms;

public class DiamondPattern {
    public static void Diamond(int n){
        int i,j;
        for(i=1;i<=n;i++) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        Diamond(n);

    }
}
