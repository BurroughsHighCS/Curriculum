class Test {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int num = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i * matrix.length) + (j + 1);
            }
        }

        //[5,4,3,4,5]
        //[10,9,8,9,10]
        //[15,14,13,14,15]
        //[20,19,18,19,20]
        //[25,24,23,24,25]

        int[][] newMatrix = reverseAllRows(matrix);

        for(int i = 0; i < newMatrix.length; i++) {
            for(int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[] reverseRow(int[] row) {
        int[] result = new int[row.length];

        int idx = row.length - 1;
        for(int i = 0; i < row.length; i++) {
             result[i] = row[idx];
             idx--;
        }

        return result;
    }

    public static int[][] reverseAllRows(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            result[i] = reverseRow(matrix[i]);
        }

        return result;
    }
}