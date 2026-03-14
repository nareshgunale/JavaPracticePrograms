package PatternPrograms;

public class NumTriangle {
    public static void Triangle(int n) {
        int i, j;
        for (i = 1;i <=n; i++) {
            for (j=1;j<=n-i;j++) {
                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=7;
        Triangle(n);
    }
}
