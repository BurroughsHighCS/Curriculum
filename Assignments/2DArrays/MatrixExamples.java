class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int[][] mat = new int[3][3];

        int[] row3 = {4,5,6};

        mat[0] = nums;
        mat[1] = nums;
        mat[2] = row3;

        int[][] reverseMat = reverseMatrix(mat);
        printMatrix(reverseMat);
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + " ");
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
}