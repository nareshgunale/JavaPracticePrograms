package PatternPrograms;

public class PascalTriangle {
    public static void Pascal(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int num=1;
            for(j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        Pascal(n);
    }
}
