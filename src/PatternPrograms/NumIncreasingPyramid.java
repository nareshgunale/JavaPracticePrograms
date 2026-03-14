package PatternPrograms;

public class NumIncreasingPyramid {
    public static void IncreasingPyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){//Rows
            for(j=1;j<=i;j++){// Columns to print numbers
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int n=6;
        IncreasingPyramid(n);

    }
}
