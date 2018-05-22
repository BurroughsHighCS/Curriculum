package game;

public abstract class MemoryPiece {
    private boolean revealed;

    public MemoryPiece() {
        this.revealed = false;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void reveal() {
        this.revealed = true;
    }

    public void unreveal() {
        this.revealed = false;
    }

    public void render() {
        System.out.print("[-]")
    }

    public abstract String getShapeType();
}