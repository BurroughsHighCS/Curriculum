# Loops
```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```

There are many situations in programming where you need to write a **loop**. A **loop** is a segment of code that will execute multiple times, based on a set of conditions provided by the programmer.

## Terminology
* While Loop
* Executing Condition
* Terminating Condition
* Break
* For Loop
* Index
* Mutating Operation

## While Loops
Let's look again at the loop from the start of this page:
```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```

This is called a **While Loop**. While loops take in a single **condition** and execute the code within their loop until that condition is no longer true. In this case, our condition is ```n <= 10```, and our while loop will execute as long as the ```n``` is less than or equal to 10. What if our loop didn't have the ```n++``` line?

```java
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
    }
```

We told the loop to execute until ```n``` is no longer less than or equal to 10, but we never change ```n```. **n will always be 1**, so our while loop will keep executing forever, waiting for a **terminating condition** that will never occur.

Look back at our original example again. The ```n++``` line increments the value of ```n``` by 1 each pass through the while loop, so n changes each time the loop executes. First it's **1**, then it's **2**, then **3** and so on until it's 10. What happens if we print ```n``` _after_ our loop?

```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
    System.out.println(n);
```

You might think that the print statement after the loop will print ```10``` because we looped until n reached 10, right? Not quite. We actually loop until n is equal to 11.

### Executing Condition vs Terminating Condition
Our _executing condition_ ```n <= 10``` tells the while loop to execute until n is no longer less than or equal to 10. With this executing condition, our _terminating condition_ would be any value of n that is **not** greater than or equal to 10:

* Executing Condition: ```n <= 10```
* Terminating Condition: ```!(n <= 10)``` or ```n > 10```

Our loop won't terminate until n is **greater than 10**. With our current code, this means that our loop will terminate once n becomes **11**.

### Valid Conditions
In a while loop, any ```Boolean``` value is a valid executing condition for a while loop.
* Comparison operators
```java
    while(n >= 0) { ... }
    while(n * n <= 1) { ... }
```
* Boolean variables
```java
    Boolean shouldLoop = true;
    while(shouldLoop) { ... }
```
* Functions returning type Boolean
```java
    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }
    while(isEven(n)) { ... }
```

## [Exercise 1](./Exercise1.md)
You should be ready to try our first looping [exercise](./Exercise1.md) to practice with While loops.

## For Loops
While loops are relatively straightforward. You give it an executing condition and it will loop until that condition is no longer true.

There is another loop that actually gets used more frequently than while loops, however, called a **For Loop**. Most loops actually follow a predefined pattern. Take our first loop, for example:

```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```

We can actually write this same loop as a **For Loop**:

```java
    for(int n = 1; n <= 10; n++) {
        System.out.println(n);        
    }
```

This is the _exact_ same loop, but it's written in a way that better communicates the conditions.

### For Loop Requirements
For loops take a 3-part condition statement:
* An **index** variable definition: ```int n = 1```
    * This is a variable that will be compared in the loop's executing condition.
* The executing condition: ```n <= 10```
    * The exact same executing condition you would use in a while loop.
* An index mutation operation: ```n++```
    * The operation that should be performed to change the index on each pass through the loop.

### The Index
We can change the index of a for loop:

```java
    for(int i = 5; i <= 10; i++) {
        System.out.println(i);        
    }
    //Only prints the integers 5 through 10
```

```java
    for(int i = -100; i <= 10; i++) {
        System.out.println(i);        
    }
    //Prints the integers from -100 to 10
```

### The Executing Condition
Just like in a while loop, we can change the executing condition:

```java
    for(int i = 1; i < 100; i++) {
        System.out.println(i);        
    }
    //Prints the numbers 1 through 99. DOES NOT print 100.
```

```java
    for(int i = 1; i > 0; i++) {
        System.out.println(i);        
    }
    //Loops forever. 
    //i will never be less than or equal to 0
    //It starts at 1 and keeps incrementing up
```

### The Mutating Operation
We can modify the mutating operation. This controls how our index changes on each pass through the loop.

```java
    for(int i = 1; i < 10; i += 2) {
        System.out.println(i);        
    }
    //prints every other number between 1 and 10
    // 1, 3, 5, 7, 9
```

```java
    for(int i = 1; i < 10; i *= 2) {
        System.out.println(i);        
    }
    //prints the powers of 2 between 1 and 10
    // 1, 2, 4, 8
```


### A Note
* We generally use the variable name ```i``` for the index of a for loop, but any variable name is acceptable.

## [Exercise 2](./Exercise2.md)
You should be ready for our second [exercise](./Exercise2.md) practicing with for loops.