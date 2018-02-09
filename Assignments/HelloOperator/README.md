# Hello Operator
We're going to start diving into the basics of the Java programming language, and there are a lot of terms you will need to understand. The following reference articles give more detail on a lot of these terms, but before you read these articles you should experiment with the exercise below them.

## Reference Articles

* [Strings](./Strings)
* [Integers & Doubles](./Integers&Doubles)
* [Boolean Logic](./BooleanLogic)

## Exercise
Before you read about these, you should try this exercise and just see how everything works in practice.

1. Make a new folder in your class repository and add the following file "Operators.java" to the folder.
    ```java
    class Operators {
        public static void main(String args[]) {

        }
    }
    ```

2. We have a java file in our folder and it will compile if you run ```javac``` on it. But it won't do anything, yet. **One at a time,** try adding all of the following code snippets to your Operators java file inside of the ```main``` function.
    * Don't delete any lines of code that work for now. Just comment them out. "Commenting out" a line of code means that you are telling Java to ignore that line when it runs. To comment out code, just add a ```//``` in front of any lines you want to be ignored. For example, assume my first test uses the code
    ```java
    String name = "Merrell";
    System.out.println(name);
    ```
    When I run my next test, I want to keep that code (I'm going to have you use **all** of these pieces of code again in a later assignment). I can comment the first test out and add the code for my next test:
    ```java
    String fullName = "Curt Merrell";
    System.out.println(fullName);

    // String name = "Merrell";
    // System.out.println(name);    
    ```
    * Now, try all of these code snippets one at a time.

    ```java
        String firstName = "YOURNAME";
        String lastName = "YOURLASTNAME";
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println("firstName");
        System.out.println(lastName);
        System.out.println("lastName");
        System.out.println(fullName);
        System.out.println("fullName");
    ```


    ```java
        //Replace the -1's with values relevant to yourself
        int currentYear = -1;
        int yearsUntilGraduation = -1;
        int myGradYear = currentYear + yearsUntilGraduation;

        System.out.println(myGradYear);
        System.out.println("myGradYear");
    ```

    ```java
        //Replace the -1's with values relevant to yourself
        int currentAge = -1;
        int nextAge = currentAge + 1;
        System.out.println(currentAge);
        System.out.println(nextAge);

        int halfCurrentAge = currentAge / 2;
        int halfNextAge = nextAge / 2;
        System.out.println(halfCurrentAge);
        System.out.println(halfNextAge);

        //"Modulo" is the name of the '%' operator. Can you figure out what the modulo operator is doing?
        int moduloCurrentAge = currentAge % 2;
        int moduloNextAge = nextAge % 2;
        System.out.println(moduloCurrentAge);
        System.out.println(moduloNextAge);
    ```

    ```java
        double bitcoinsOwned = .000001;
        double bcsCoinsOwned = 2;

        double bitcoinValue = 10000;
        double bcsCoinValue = 0;

        double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
        double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
        System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
        System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);

        //Let's assume I can get it so you can redeem 25 BCSCoins for a $5 giftcard.
        double reward = 5;
        double amtToRedeem = 25;
        bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
        System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");

        bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue; //This is the exact same calculation we used earlier, but we updated bcsCoinValue, so let's calculate it again.
        System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);    
    ```

    ```java
        Boolean haveJob = false;
        Boolean lookingForWork = true;
        Boolean canProgram = false;
        int currentSavings = 500;

        //There are some print statements below. Can you guess which ones will print?
        if(!haveJob) {
            if(lookingForWork && canProgram) {
                System.out.println("Your chances as getting a job go up!");
            }
            else {
                System.out.println("You might need to gain more skills before you can get a job.");
            }
        }
        if(currentSavings < 500) {
            System.out.println("You should be saving more money.");
        }
        else {
            System.out.println("Do you need to save more money, still?");
        }
    ```

3. Now that you've run some of my provided code, let's see if you can make your own. Try writing more snippets to do the following:
    * Make "targetSavingsGoal" and "savingsPerMonth" variables, and see how many months it will take to reach your goal.
    * Pick 15 random words and assign them to String variables, then print out 3 or more random sentences using various combinations of those words.
    * Make "hasGirlfriend" (or boyfriend), "hasMoney", and "hasJob" as Boolean variables. Write an if-else tree that will print:
        * "Success!" if you have an SO
        * "You can do it!" if you have a either a job or money.
        * Otherwise, print a proud single life statement.
