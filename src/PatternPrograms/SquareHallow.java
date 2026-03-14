package PatternPrograms;

public class SquareHallow {
    public static void SquarePattern(int n){
        int i,j;
        for(i=0;i<n;i++){//rows
            for(j=0;j<n;j++){//columns
                if(i==0||i==n-1||j==0||j==n-1){ //First row->Top,Last Row->Bottom,First column->left,Last Column->Right
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=8;
        SquarePattern(n);

    }
}
