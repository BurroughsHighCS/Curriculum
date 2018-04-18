import utils.*;

class Example {
    public static void main(String[] args) {
        // staticSentenceExample();

        // matrixTest1();

        matrixTest2();
    }

    public static void staticSentenceExample() {
        String sentence = "";
        for(int i = 0; i < 10; i++) {
            sentence = StaticSentenceUtil.generateSentence();
            System.out.println(sentence);
        }
    }

    public static void matrixTest1() {
        int[][] matrix = StaticMatrixUtil.generateRandomMatrix(3,3);
        StaticMatrixUtil.printMatrix(matrix);
    }

    public static void matrixTest2() {
        int[][] matrix = StaticMatrixUtil.generateRandomMatrix(4,4,1234);
        StaticMatrixUtil.printMatrix(matrix);
    }

}