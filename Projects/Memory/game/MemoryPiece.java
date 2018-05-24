package game;

public abstract class MemoryPiece {
    private boolean revealed;

    public MemoryPiece() {
        this.revealed = true;
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

    public boolean sameAs(MemoryPiece other) {
        if(this.getShapeType().equals(other.getShapeType()))
            return true;
        
        return false;
    }

    public abstract String getShapeType();
    public abstract MemoryPiece getCopy();
    public abstract void render();

}