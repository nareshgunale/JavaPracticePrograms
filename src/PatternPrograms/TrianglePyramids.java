package PatternPrograms;

public class TrianglePyramids {
    public static void RightHalfPyramid(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
    public static void LeftHalfPyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        RightHalfPyramid(n);
        LeftHalfPyramid(n);
    }
}
