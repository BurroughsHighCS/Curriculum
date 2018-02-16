import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else {
            System.out.println("Other modes not yet supported."); //Replace this with calls to your appropriate functions            
        }
    }

    public static void flatInterest() {
        System.out.println("Still a stub function. Not yet implemented"); //Delete this once you implement the function
        //Calculate flat interest and print it out here
    }

    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}
