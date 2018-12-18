# Functions
When writing code, there are a number of reasons we shouldn't just write all of our code in one sequential block of text.

* It gets increasingly difficult to navigate your code.
* Often, we need to run the same few lines of code several times.
* Breaking our code down into parts provides a cleaner, more complete solution to a problem.

There are many tools we use to break our code down into smaller, more intelligent pieces. The first of these are **functions**.

## Terminology
* Function
* Parameter
* Type/Variable Declarations
* Variable Definitions
* Return
* Void

## Examples, Definitions, & Explanations
A function is an operation which takes zero or more **parameters** and typically **returns** a result of that operation.

```java
    public Boolean isEven(int x) {
        return x % 2 == 0;
    }
```

Looking at our ```isEven``` function again we can identify all of its parts. The ```int x``` within the parentheses is the function's only parameter. We can have zero or more parameters in a function, but in this case we just need one.

Within the context of this function, we can assume that we will be given an integer. We will call that integer x and determine whether or not that integer is and even number.

The ```public Boolean``` declares this function's return **Type**.

Remember the data types we've discussed so far:
* String
* int
* double
* Boolean

In this case, we have declared that we will be returning a Boolean. This puts some constraints on our function. If the body of our function says:

```java
    return 12;
```

Our code won't compile. We told it this function will return the type ```Boolean``` and we tried to return an ```int```. Similar compiler errors would occur if we tried to return any type other than ```Boolean```. We are also _required_ to return a Boolean. If we leave the return statement out, the compiler will also reject our program. We promised we would return a boolean, so we _must_ return that boolean:

```java
    //Here's our boolean that we're returning.
    //It returns true if x is evenly divisible by 2, otherwise it returns false
    return x % 2 == 0;
```

### Return Values
We put a lot of constraints on ourselves by declaring a return type, but those constraints give us the ability to make some important assumptions when we call our function:

```java
    public static void main(String args[]) {
        int x = 11;

        if( isEven(x) ) {
            System.out.println("X is Even.");
        }
        else {
            System.out.println("X is Odd.");
        }
    }
```

If statements only work with Boolean typed conditions. If we try to put an int, or a double, or any other value inside an if statement, we will get errors. Because we defined our ```isEven``` function to return a Boolean, we can use it in this if statement.

When our program reaches the if statement, it will execute the ```isEven``` function. It will pass the integer ```x``` as a parameter, which is equal to **11** in our example.

```java
    public Boolean isEven(int x) {
        return x % 2 == 0;
    }
```

The ```isEven``` function receives this parameter ```x```, then returns the result of the operation ```x % 2 == 0```. Because x is 11, x % 2 equals 1, and that operation returns ```false```. Our ```isEven``` function then **returns** that ```false``` result back up to the place that called it.

Now we're back here:

```java
    if( isEven(x) ) {
        System.out.println("X is Even.");
    }
    else {
        System.out.println("X is Odd.");
    }
```

Because our function call returned ```false```, the computer now sees something (temporarily) more like this:

```java
    if( false ) {
        //...
    }
    else {
        //...
    }
```

Our if statement is false, so we go to the else clause and print "X is Odd."

### Reusability
Because we've extracted ```isEven``` into a function, we can use it for any integer and we can use it as many times as we want without having to rewrite it:

``` java
    int a = 2;
    int b = 4;
    int c = 6;
    int d = 8;
    int e = 10;

    if(isEven(a) && isEven(b) && isEven(c) && isEven(d) && isEven(e)) {
        System.out.println("All of the integers are even.");
    }
    else {
        System.out.println("At least one of the integers is odd.");        
    }
```

Remember that our function declared its parameter as ```int x```, but we passed it a bunch of integers with different variable names. This is another strength of writing functions. No matter what you name the variable, once you pass it to the function, the function considers it ```x``` within its own **scope**. We will talk more about variable scope in a later assignment, but for now understand that functions can use whatever name they want for their parameters.

## Exercise
To wrap up the basics, we will spend a significant chunk of time working on the following stubbed class for a `CruiseControl` program.

```java
class CruiseControl {
    static Boolean cruiseControlSet = false;
    static int speed = 0;
    static final int MAX_SPEED = 45;
    static int warningSpeed = 25;

    public static void main(String[] args) {

    }

    public static void toggleCruiseControl() {

    }

    public static void incrementSpeed() {

    }

    public static void decrementSpeed() {

    }

    public static void reportSpeed() {

    }

    public static void alert(Boolean isDecelerating) {

    }

    public static Boolean exceedsWarningThreshold(int speed) {

    }
}
```

We will build out the various functions of this program in class.
