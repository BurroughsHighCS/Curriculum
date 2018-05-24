package game;

public class Exclamation extends MemoryPiece {
    public void render() {
        if(!this.isRevealed()) {
            System.out.print("[-]");
        }
        else {
            System.out.print(" ! ");
        }
    }

    public String getShapeType() {
        return "Exclamation";
    }

    public MemoryPiece getCopy() {
        return new Exclamation();
    }
}