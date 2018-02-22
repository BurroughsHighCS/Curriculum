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
        //i is alive within the loop.
        //i's SCOPE is limited to this for loop
    } //Once the for loop terminates, i reaches the end of its scope
```