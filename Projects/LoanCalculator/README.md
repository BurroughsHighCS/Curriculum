# Loan Calculator
Many of you might be considering taking out loans to pay for a college education. Eventually, you may take out a loan to buy a house. Your first real application should prove to be a legitimate tool you might use to help you manage your finances and make judgements about going into debt. You're going to make a command line application that will read in some properties of a loan and report back to you some information about the true cost of that loan.

## Requirements

In the ```main``` function:
1. Prompt the user to select one of three modes:
    * (1) Flat Interest
    * (2) Compounding Interest _Without_ Payments
    * (3) Compounding Interest _With_ Payments
    * NOTES:
        * Use a Scanner to read in all user inputs.
        * The user should select these modes by typing an ```int``` into the command line.
        * Entering 1 should put the user into "Flat Interest" mode, 2 goes to "Compounding Interest Without Payments" and 3 goes to "Compounding Interest With Payments".
        * If the user enters _any_ invalid value (Not an integer, or an integer that is not 1, 2, or 3), re-prompt the user to enter an integer. (You will need to use a while loop. See the provided code).
        * Once any user input is validated, store it in an appropriate data type (int, double, etc.).

2. Prompt the user to enter a loan amount (double).
    * NOTES:
        * A loan amount can be any positive double value.
        * If an invalid input is received, re-prompt the user the enter the value.

3. Prompt the user to enter a loan term in years (int).
    * NOTES:
        * A loan term can be any positive integer value.
        * If an invalid input is received, re-prompt the user the enter the value.

4. Prompt the user to enter an interest rate (%).
    * NOTES:
        * An interest rate can be any positive double value between 0 and 100.
        * Users should be expected to input the rate as a _whole percent_ value, but the application should store it as a fraction value between 0 and 1.
            * i.e. - User enters 4.25, but the application stores it as ```double interestRate = .0425;```
        * If an invalid input is received, re-prompt the user the enter the value.

5. Using the user selected mode, calculate and print the interest in one of the **separate functions**:
    * ```flatInterest``` (return type **void**)
    * ```compoundingNoPayments``` (return type **void**)
    * ```compoundingWithPayments``` (return type **void**)

### Flat Interest
Flat interest calculation should be relatively simple:

```
    //Flat Interest Formula (NOT VALID CODE)
    interest = principal * interestRate * term
```

The Flat Interest mode should print out the following values to the command line:
* Original Loan Amount
* Loan Term
* Interest Rate
* Interest to be paid
* Total amount to be paid

An acceptable application will print the above values with helper text explaining the values:

```
    //Unacceptable output:
    20000
    5
    2.75
    2750
    22750

    //Acceptable output:
    Original Loan Amount: $20000
    Loan Term: 5 years
    Interest Rate: 2.75%
    Interest over term: $2750
    Total cost of loan: $22750
```

### Compounding Interest Without Payments
Almost all modern loans calculate interest by compounding monthly, using a yearly interest rate. This means that each month the interest for that month actually increases over the previous month, because it includes the previous month's interest in the current month's interest calculation.

For Compounding interest, a ```while``` loop will be necessary:

```
    //Compounding Interest Formula (NOT VALID CODE)
    while(monthsRemaining > 0) {
        interest = loanTotal * (interestRate / 12)
        loanTotal = loanTotal + interest
    }
    interest = loanTotal - principal
```

The Compounding Interest (without payments) mode should print the following values to the command line:
* Original Loan Amount
* Loan Term
* Interest Rate
* Interest to be paid
* Total amount to be paid

### Compounding Interest With Payments
In a typical compounding interest loan, you will make monthly payments against the outstanding balance which are also included in each consecutive month's interest calculation. By making these payments, you decrease the outstanding balance, which decreases the amount of interest you pay each month.

Loan issuers will calculate a **minimum monthly payment** to pay off your loan within the specified term. The math to calculate this minimum payment is complex, so I will provide the exact code to calculate the monthly payments (You will need to change some variable names to match your own variable names):

```java
double ratePerMonth = interestRate /12;
double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * -12))));
```

If you want to understand this calculation better, it follows the formula provided in method 2 at [this website](https://www.wikihow.com/Calculate-Loan-Payments):

```
The formula to use when calculating loan payments is M = P * ( J / (1 - (1 + J)^(-N))). Follow the steps below for a detailed guide to using this formula, or refer to this quick explanation of each variable:
M = payment amount
P = principal, meaning the amount of money borrowed
J = effective interest rate. Note that this is usually not the annual interest rate; see below for an explanation.
N = total number of payments
```

Once a monthly payment has been calculated, the new interest computation should follow the formula:

```
    //Compounding WITH Payments formula (NOT VALID CODE)
    while(outstandingBalance > 0) {
        interest = outstandingBalance * (interestRate / 12)
        outstandingBalance = outstandingBalance + interest - monthlyPayment
    }
```

The Compounding Interest (with payments) mode should print the following values to the command line:
* Original Loan Amount
* Loan Term
* Interest Rate
* Minimum Monthly Payment
* Payment amount for the final month of the loan
    * (This should be less than the monthly payment amount, because you won't have the full amount remaining on your loan on the final month)
* Interest to be paid
* Total amount to be paid


## Provided Code
For this project, you will be provided a partial class that you need to complete. You can find that class in this directory of the course Github: [LoanCalculator.java](./LoanCalculator.java)

```java
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
```

The code provided should give you a good jump start on the project. Two things are worth noting that you haven't yet done in assignments yourself:

#### First
Note the values provided at the top of the ```LoanCalculator``` class:
```java
public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    //...

}
```

These are called **class variables**. Instead of declaring variables inside our class's functions like we normally do, we can declare them at the **root** of the class. This way, these variables will be accessible anywhere inside the ```LoanCalculator``` class.

You should never have to write ```int mode``` in this project. ```mode``` has already been declared as an int available class-wide. If you need to assign mode, just write ```mode = //somevalue```, rather than ```int mode = //somevalue```;

#### Second
Note the while loop in the ```main``` function:
```java
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
```

If you have been in class, we have discussed what this code does. If not, you should not have to worry too deeply about understanding it fully yet. We will have a full assignment dedicated to understanding code loops. For now, understand that this code executes an **infinite loop** prompting the user to enter either 1, 2, or 3 to select their mode. The loop will not terminate until it reaches the ```break;``` statement inside the deepest if statement:

```java
    if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
        break; //Valid input has been provided. Break out of the while loop
    }
```

This ```break;``` statement will only execute if the user provides (1) a valid integer that is (2) greater than 0 and less than 4. The values 1, 2, and 3 are the only possible inputs that meet those criteria.

When you request other inputs from the user, you should follow the model provided by this for loop, though some simple modifications will be necessary:
* For double inputs, swap ```scan.hasNextInt()``` with ```scan.hasNextDouble()``` and swap ```scan.nextInt()``` with ```scan.nextDouble()```
* The print statement in the mode selector is big, so I made it its own function so it wouldn't gunk up my mode selection loop. For the other user inputs, you will need to replace the ```printModeStatement()``` function call with a statement relevant to the value you need the user to enter.
