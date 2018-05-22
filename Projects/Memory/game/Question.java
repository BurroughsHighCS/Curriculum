package game;

public class Question extends MemoryPiece {
    public void render() {
        if(!this.isRevealed()) {
            super.render();
        }
        else {
            System.out.print(" ? ")
        }
    }

    public String getShapeType() {
        return "Question";
    }
}