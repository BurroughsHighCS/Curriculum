# Plinko
![Plinko Board](./PlinkoBoard.jpg)

Plinko used to be more common back when _The Price is Right!_ was still popular on tv. Now if you've seen it, it was probably at a local fairgrounds or carnival or something.

In Plinko, you drop a ball or a disc into one of the 9 slots at the top of the board and it bounces down through the pegs, shifting left and right until it lands in one of the 9 slots at the bottom of the board, where each of the slots has a point value for your winnings.

## Requirements
1. Prompt the user to select one of 3 modes:
    * (1) Single Disc
    * (2) Multi Disc
    * (3) Quit
    * NOTES: 
        * The _whole_ program will be inside of a ```while(true)``` loop which only breaks if the user selects the "Quit" option (3) from the starting menu.
        * If the user selects an invalid option, simply reprompt them with the same menu.

2. Based on the mode selection, execute the appropriate command:

### Single Ball Mode
1. Prompt the user to select which position they want to drop their Plinko disc into.
    * There are 9 possible positions the user can select: 0, 1, 2, .., 7, 8.
    * If the user enters an invalid option, re-prompt them.

2. Begin moving the disc down through each row of pegs until it reaches a final slot.
    * There are 13 rows of pegs, including the first row and the final slots.
    * You do not need to move the disc for the first row. This is the slot that the user selects.
        * This means your disc should shift **12 times** before it reaches the destination.
    * At each row, the plinko disc should move left (- position) or right (+ position) but it should only move 1 position each row
        * If you look at the plinko board, you'll see that every alternating row has "half" positions. These will present a problem to you because the user is required to enter an integer value between 0 and 8. You can either:
            * Multiply the user input by 2, so inputs of 0,1,..,7,8 become inputs of 0,2,..,14,16.
                * This lets you stay in the integer data type.
            * Convert the integer input to a double.
                * If you do this, each shift in the next step will be a position shift of .5 instead of 1.
        * There are boundaries to the Plinko board:
            * A disc cannot move left if it is in the leftmost position (0).
            * A disc cannot move right if it is in the rightmost position (8/16).

3. At each row in single ball mode, the application should print out a visual representation of its row. After all the rows are complete, a the printout should look something like this:

    * ```
         . . . .O. . . .
        . . . .O. . . . .
         . . . .O. . . .
        . . . .O. . . . .
         . . .O. . . . .
        . . .O. . . . . .
         . .O. . . . . .
        . . .O. . . . . .
         . . .O. . . . .
        . . .O. . . . . .
         . . .O. . . . .
        . . .O. . . . . .
         . . .O. . . . .
    ```
    * This printout can be done using a for loop. For example, I print my even-numbered rows using this for loop (I used the 16 position method):    
        * ```java
            for(int i = 0; i <= 16; i++) {
                if(position == i) {
                    System.out.print("O");
                }
                else if(isEven(i)) {
                    System.out.print(".");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        ```
        * Your odd rows should look different than the even numbered rows. What needs to change in this for loop to correctly print the odd numbered rows?

4. Once the disc has reached its destination, print out the position as well as the number of points the user won for landing in that position.
    * The points should come from a ```VALUES``` integer array which is provided with the initial code. The contents of the VALUES array should be as follows:
        * ```java
            int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
        ```
    * If you need help reading data from the array, there are some explanations of arrays at the bottom of this document (or you can click [here](#arrays)).


### Arrays <a id="arrays" name="arrays" />
Array info