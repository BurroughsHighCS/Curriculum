import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int startingPosition = -1;
    public static int numDiscs = 1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            Boolean isMultiDisc = false;
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    isMultiDisc = false;
                }
                else if(mode == MULTI_DISC) {
                    isMultiDisc = true;
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }

            collectSettings(isMultiDisc);
            runPlinko(isMultiDisc);
        }
    }

    public static void runPlinko(Boolean isMultiDisc) {

    }

    public static void printOddRow(int discPosition) {
        //Print the visualization of an odd numbered row with the disc in the provided position.
    }

    public static void printEvenRow(int discPosition) {
        //Print the visualization of an even numbered row with the disc in the provided position.
    }

    public static void collectSettings(Boolean isMultiDisc) {
        Scanner scan;
        Boolean isValidInput = false;
        while(!isValidInput) {
            scan = new Scanner(System.in);
            System.out.print("Pick a slot to drop the disc(s) (0-8): ");
            if(scan.hasNextInt()){
                startingPosition = scan.nextInt() * 2;
                if(0 <= startingPosition && startingPosition <= 16) {
                    isValidInput = true;
                }
            }
        }

        //How many discs will be dropped?
        isValidInput = false;
        if(isMultiDisc) {
            while(!isValidInput) {
                scan = new Scanner(System.in);
                System.out.print("Enter # of discs to drop: ");
                if(scan.hasNextInt()){
                    numDiscs = scan.nextInt();
                    if(numDiscs > 0) {
                        isValidInput = true;
                    }
                }
            }
        }
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}
