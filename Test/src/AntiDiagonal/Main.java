package AntiDiagonal;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {3, 15, 6},
                {5, 2, 5}
        };

        System.out.println(getAntiDiagonalAvg(matrix));
    }

    private static double getAntiDiagonalAvg(int[][] matrix) throws IllegalArgumentException {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                throw new IllegalArgumentException("Argument is not a matrix.");
            }
        }
        int sum = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            sum += matrix[matrix.length - i - 1][i];
        }
        return sum / (double) matrix.length;
    }


}
