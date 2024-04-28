public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{2, 0}, {1, 2}};

        int rowsA = matrixA.length;
        int colA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colB = matrixB[0].length;

        if (colA != rowsB) {
            System.out.println("ERROR: Number of columns in Matrix A must equal number of rows in Matrix B.");
            return;
        }

        int[][] result = new int[rowsA][colB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
