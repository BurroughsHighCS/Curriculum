public class Arrays {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];

		for(int i = 0; i < matrix.length; i++) {
			// i -> 0, 1, 2
			for(int j = 0; j < matrix[i].length; j++) {
				// j -> 0, 1, 2
				matrix[i][j] = (i * 2) * (j * 2);
			}
		}
		//[0, 0, 0]
		//[0, 4, 8]
		//[0, 8, 16]

		for(int i = 0; i < matrix.length; i++) {
			matrix[i] = reverseRow(matrix[i]);
		}

		printMatrix(matrix);
	}

	public static int[] reverseRow(int[] row) {
		int[] result = new int[row.length];
		for(int i = 0; i < row.length; i++) {
			result[i] = row[row.length - (i + 1)];
		}
		return result;
	}

	public static void printMatrix(int[][] matrix) {
		for(int[] arr: matrix) {
			for(int item : arr) {
				System.out.print(item + ", ");
			}
			System.out.println();
		}
	}

}