import game.*;

public class Launcher {
    public static void main(String[] args) {
        MemoryGame game = new MemoryGame(6, 10);

        game.run();
    }
}