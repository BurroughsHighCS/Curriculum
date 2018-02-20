# Loops
```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```

There are many situations when programming where you need to write a **loop**. A **loop** is a segment of code that will execute multiple times, based on a set of conditions provided by the programmer.

## Terminology
* While loop
* Executing Condition
* Terminating Condition
* For loop
* Iterate
* Index
* Break
* Condition

## Examples & Explanation
Let's look again at the loop from the start of this page:
```java
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```

This is called a **While Loop**. While loops take in a single **condition** and execute the code within their loop until that condition is no longer true. In this case, our condition is ```n <= 10```, and our while loop will execute as long as the ```n``` is less than or equal to 10. What if our while didn't have the ```n++``` line?

```java
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
    }
```

We told the loop to execute until ```n``` is no longer less than or equal to 10, but we never change ```n```. **n will always be 1**, so our while loop will keep executing forever, waiting for a _terminating condition_ that will never occur.

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

Our loop won't terminate until n is **greater than 10**. With our current code, this means that