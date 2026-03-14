package Practice.Array;

public class AdditionOfTwoMatrix {

        public static void main(String[] args) {

            // Declare and initialize two matrices
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] matrix2 = {
                    {7, 8, 9},
                    {1, 2, 3}
            };

            int rows = matrix1.length;
            int cols = matrix1[0].length;

            // Result matrix
            int[][] sum = new int[rows][cols];

            // Add matrices
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Sum of the matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


