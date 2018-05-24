package game;

public class Question extends MemoryPiece {
    public void render() {
        if(!this.isRevealed()) {
            System.out.print("[-]");
        }
        else {
            System.out.print(" ? ");
        }
    }

    public String getShapeType() {
        return "Question";
    }

    public MemoryPiece getCopy() {
        return new Question();
    }
}