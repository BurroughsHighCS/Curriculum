package game;

public class Star extends MemoryPiece {
    public void render() {
        if(!this.isRevealed()) {
            System.out.print("[-]");
        }
        else {
            System.out.print(" * ");
        }
    }

    public String getShapeType() {
        return "Star";
    }

    public MemoryPiece getCopy() {
        return new Star();
    }
}