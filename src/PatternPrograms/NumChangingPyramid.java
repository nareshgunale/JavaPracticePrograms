package PatternPrograms;

public class NumChangingPyramid {
    public static void NumChanging(int n){
        int i,j;
        int num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        NumChanging(n);
    }
}
