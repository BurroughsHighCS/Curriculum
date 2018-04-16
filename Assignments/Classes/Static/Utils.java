import utils.*;

class Utils {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int[][] mat = new int[3][3];

        int[] row3 = {4,5,6};

        mat[0] = nums;
        mat[1] = nums;
        mat[2] = row3;

        int[][] reverseMat = MatrixUtil.reverseMatrix(mat);
        MatrixUtil.printMatrix(reverseMat);
    }
}