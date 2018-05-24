package game;

public class Dollar extends MemoryPiece {
    public void render() {
        if(!this.isRevealed()) {
            System.out.print("[-]");
        }
        else {
            System.out.print(" $ ");
        }
    }

    public String getShapeType() {
        return "Dollar";
    }

    public MemoryPiece getCopy() {
        return new Dollar();
    }
}