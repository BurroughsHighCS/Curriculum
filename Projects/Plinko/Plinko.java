import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    System.out.println("Mode not yet implemented");
                }
                else if(mode == MULTI_DISC) {
                    System.out.println("Mode not yet implemented");
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public static int runOddRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }

    public static int runEvenRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
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
