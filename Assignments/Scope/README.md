# Scope
Understanding the **Scope** of data is critical to being efficient at writing code. 

## Terminology
* Scope
* Declaration
* Definition
* Class Variable
* Parameter

## The Lifetime of Variables
```java
    for(int i = 0; i < 10; i++) {
        System.out.println(i);
    }
```

This for loop is pretty simple. It loops 10 times&#8212;once for each value of its index ```i``` between 0 and 10. In this case, it prints the integers from 0 to 9 (not 1 through 10).

What happens if we try to print ```i``` once the loop is complete?

```java
    for(int i = 0; i < 10; i++) {
        System.out.println(i);
    }
    System.out.println(i);
```

Java will throw a compiler error:

```
Test.java:6: error: cannot find symbol
        System.out.println(i);
```

This is because we tried to reference the index variable i **Outside of its Scope**.

You might think of a variable's scope as its _lifespan_. When you **declare** a variable, you give it a temporary life. But once the variable reaches the end of its scope, it dies and the computer throws it away.

Let's break down ```i```'s scope in our for loop here.

```java
    for(int i = 0; i < 10; i++) { //Our for loop declares the variable i
        System.out.println(i);
        //i is alive within the loop.
        //i's SCOPE is limited to this for loop
    } //Once the for loop terminates, i reaches the end of its scope

    //If we try to reference i here, Java will throw an error.
    //This is because i has been thrown away and no longer exists.
    //It's OUT OF SCOPE
```

Okay, so index variables within for loops don't exist outside of their loop. But what about some other common scope errors? Let's revisit our loan calculator. Many students tried to do something like this:

```java
    while(monthsRemaining > 0) {
        double interest = rate * loanAmt;
    }
    System.out.println(interest);
```

You might expect this to print the total interest from the loop, but there are a number of issues with that expectation.

Our first problem is that we calculate an interest value with ```rate * loanAmt```, but it's only one month's worth of interest. We aren't adding it to any variable that gets tracked over multiple months.

The second, and more critical problem is that the declaration of the interest variable is _inside_ the while loop. Its scope is limited to this while loop, so as soon as we leave the while loop, it goes out of scope and gets thrown away.

If you try to compile this using ```javac```, you will get the same error we got earlier:

```
Test.java:6: error: cannot find symbol
        System.out.println(i);
```

## Scope of Functions
Consider the following two functions:

```java
class 
    public static void main(String[] args) {
        int n = 1;
        while(n < 10) {
            if(isEven()){
                System.out.println(n + " is even");
            }
        }
    }

    public static Boolean isEven() {
        return n % 2 == 0;
    }
```

These two functions won't work. You will get an error because we never declared a variable ```n``` inside the ```isEven``` function. Even though there _is_ a variable named ```n``` inside the ```main``` function, the scope of that ```n``` is limited to the main function. As soon as we enter a different function, the variable ```n``` is out of scope.

There are two ways that we can fix this.
