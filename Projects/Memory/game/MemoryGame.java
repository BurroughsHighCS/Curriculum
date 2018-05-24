package game;

import java.util.ArrayList;
import java.util.Scanner;
import game.util;

public class MemoryGame {
    private int size;
    private int numShapeTypes;
    private int numMisses;
    private MemoryPiece[][] board;

    public MemoryGame(int size, int numMisses) {

        this.size = size;
        this.numMisses = numMisses;
        this.numShapeTypes = 4;

        //Queue up shapes to add to the board
        int totalShapes = size * size;
        int numEachShape = totalShapes / numShapeTypes;
        if(totalShapes % numShapeTypes != 0) {
            System.out.println("ERROR: Total shapes does not divide evenly for number of each shape.");
            System.out.println("Board will not populate correctly.");
        }
        ArrayList<MemoryPiece> toAdd = new ArrayList<MemoryPiece>();

        //Add stars to queue
        for(int i = 0; i < numEachShape; i++) {
            toAdd.add(new Star());
        }

        //Add dollars to queue
        for(int i = 0; i < numEachShape; i++) {
            toAdd.add(new Dollar());
        }

        //Add questions to queue
        for(int i = 0; i < numEachShape; i++) {
            toAdd.add(new Question());
        }

        //Add exclamations to queue
        for(int i = 0; i < numEachShape; i++) {
            toAdd.add(new Exclamation());
        }

        this.board = new MemoryPiece[this.size][this.size];
        for(int i = 0; i < this.size; i++) {
            for(int j = 0; j < this.size; j++) {
                this.board[i][j] = toAdd.remove(0);
            }
        }

        shuffleBoard();
    }

    private void shuffleBoard() {
        //Swaps 2 positions in the board an arbitrary number of times
        //We use size * size * 5 to perform the swap 5 times for the total number of items in the board.
        for(int i = 0; i < (this.size * this.size * 10); i++) {
            int r = (int) (Math.random() * size);
            int c = (int) (Math.random() * size);
            int r2 = (int) (Math.random() * size);
            int c2 = (int) (Math.random() * size);

            System.out.println("Item1: (" + r + "," + c + ")");
            System.out.println("Item2: (" + r2 + "," + c2 + ")");

            MemoryPiece temp = this.board[r][c]; //store item 1
            this.board[r][c] = this.board[r2][c2]; //move item 2 into position 1
            this.board[r2][c2] = temp; //move stored item 1 into position 2
        }
    }

    private void render() {
        //Print Column Indices
        System.out.print("   ");
        for(int col = 0; col < this.size; col++) {
            System.out.print("  " + col + " ");
        }
        System.out.println("");

        for(int i = 0; i < this.size; i++) {
            //Print Row Indices
            System.out.print(i + ": |");
            for(int j = 0; j < this.size; j++) {
                this.board[i][j].render();
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    private boolean isVictory() {
        for(int i = 0; i < this.size; i++) {
            for(int j = 0; j < this.size; j++) {
                if(!this.board[i][j].isRevealed())
                    return false;
            }
        }

        return true;
    }

    public void run() {
        boolean victory = false;
        while(this.numMisses > 0) {
            this.render()

            //Get first coordinate and reveal it
            Coordinate c1 = this.getRevealCoordinate();
            MemoryPiece p1 = this.board[c1.row][c1.column];
            p1.reveal();
            this.render();

            //Get second coordinate and reveal it
            Coordinate c2 = this.getRevealCoordinate();
            MemoryPiece p2 = this.board[c2.row][c2.column];
            p2.reveal();
            this.render()

            if(p1.sameAs(p2)) { //If they're the same, leave revealed
                System.out.println("Good job!");
            }
            else { //If not the same, unreveal them and decrement numMisses
                System.out.println("Too Bad");
                p1.unreveal();
                p2.unreveal();
                numMisses--;
            }
        }
    }

    public Coordinate getRevealCoordinate() {

    }
}