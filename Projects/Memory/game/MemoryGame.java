package game;

public class MemoryGame {
    private int size;
    private int numShapes;
    private int numMisses;
    private MemoryPiece[][] board;

    public MemoryGame(int size, int numShapes, int numMisses) {
        this.size = size;
        this.numShapes = numShapes;
        this.numMisses = numMisses;

        int totalShapes = size * size;
        int numEachShape = totalShapes / numShapes;
        if(numEachShape % 2 != 0) {
            numEachShape--;
        }

        board = new MemoryPiece[size][size];
        int numShape = numEachShape;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                
                board[i][j] = new MemoryPiece();
            }
        }
    }

    private MemoryPiece getNextShape(MemoryPiece currPiece) {
        if(currPiece.getShapeType().equals("Star"))
            return new Dollar();
        else if (currPiece.getShapeType().equals("Dollar"))
            return new Exclamation();
        else if (currPiece.getShapeType().equals("Exclamation"))
            return new Question();
        else
            return new Star();
    }
}