public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };
        int minDiagonalElement = findMinDiagonalElement(matrix);
        System.out.println("Min element on diagonal: " + minDiagonalElement);
    }
    public static int findMinDiagonalElement(int[][] matrix) {
        int minElement = Integer.MAX_VALUE;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Exclude the intersection of diagonals
            if (i != n / 2) {
                minElement = Math.min(minElement, matrix[i][i]);
            }
        }
        return minElement;
    }
}
