public class MatrixScheme {
    public static void main(String[] args) {
        int[][] matrix1 = generateMatrixScheme1(4);
        printMatrix(matrix1);

        int[][] matrix2 = generateMatrixScheme2(6);
        printMatrix(matrix2);

        int[][] matrix3 = generateMatrixScheme3(8);
        printMatrix(matrix3);
    }
    public static int[][] generateMatrixScheme1(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    public static int[][] generateMatrixScheme2(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    matrix[i][j] = 2;
                } else {
                    if (i == 1 || i == n - 2 || j == 1 || j == n - 2) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        return matrix;
    }
    public static int[][] generateMatrixScheme3(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    matrix[i][j] = 3;
                } else {
                    if (i == 1 || i == n - 2 || j == 1 || j == n - 2) {
                        matrix[i][j] = 2;
                    } else {
                        if (i == 2 || i == n - 3 || j == 2 || j == n - 3) {
                            matrix[i][j] = 1;
                        } else {
                            matrix[i][j] = 0;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    //method of matrix output to console
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
