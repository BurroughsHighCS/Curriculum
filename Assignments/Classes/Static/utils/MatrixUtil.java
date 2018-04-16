package utils;

import java.util.Random;

public class MatrixUtil {
    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }

    public static int[][] reverseMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            result[i] = reverseArray(matrix[matrix.length - 1 - i]);    
        }

        return result;
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (100.0 * Math.random());
            }
        }

        return matrix;
    }

    public static int[][] generateRandomMatrix(int rows, int cols, int seed) {
        //Uses seeded "randomization" to produce matrices.
        //Given the same seed, the resulting matrix will always be the same.
        Random r = new Random(seed);

        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = Math.abs(r.nextInt() % 100);
            }
        }

        return matrix;
    }

}
