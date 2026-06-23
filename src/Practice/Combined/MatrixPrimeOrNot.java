package Practice.Combined;

import java.util.Scanner;

public class MatrixPrimeOrNot {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % 2 == 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m<=0 || n<=0){
            System.out.println("Wrong Input");
            return;
        }
        int[][] matrix = new int[m][n];
        int limit = m*n;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();


                if (matrix[i][j] < limit) {
                    System.out.println("Wrong Input");
                    return;


                }
            }
        }
        for(int i=0;i<m;i++){
            boolean hasPrime= false;
            for(int j=0;j<n;j++){
                if(isPrime(matrix[i][j])){
                    hasPrime = true;
                    break;
                }
            }
            if(!hasPrime){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }
}
