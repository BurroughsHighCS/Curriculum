package utils;

import java.util.Random;

public class ConstructedMatrixUtil {
    private int[][] matrix;

    public ConstructedMatrixUtil(int[][] gMatrix) {
        this.matrix = gMatrix;
    }

    public ConstructedMatrixUtil() {
        this.matrix = generateRandomMatrix(3,3);
    }

    public ConstructedMatrixUtil(int rows, int cols) {
        this.matrix = generateRandomMatrix(rows, cols);
    }

    public void printMatrix() {
        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + "\t");
            }
            System.out.print("\n");
        }
    }

    private int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }

    public int[][] reverseMatrix() {
        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            result[i] = reverseArray(matrix[matrix.length - 1 - i]);    
        }

        return result;
    }

    private int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (100.0 * Math.random());
            }
        }

        return matrix;
    }

    private int[][] generateRandomMatrix(int rows, int cols, int seed) {
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