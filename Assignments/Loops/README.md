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
    //A while loop that prints the numbers 1 through 10, then terminates.
    int n = 1;
    while(n <= 10) {
        System.out.println(n);
        n++;
    }
```
