# The Lifetime of Data
The variables and other data that you use in your programs don't exist permanently unless you deliberately store them as permanent files, but some of your variables may survive longer than others. Let's try to better explain the lifetime of a variable.

## Terminology
* Declaration
* Definition
* Null
* Class Variable
* Parameter

## Declaration vs. Definition
We have talked about these two terms before, but it's important that we review them to make sure we really understand them:

```java
    int n = 1;
```

This code snippet **declares** AND **defines** the variable ```n```. We can rewrite this code to separate the two:

```java
    int n; //Declaration
    n = 1; //Definition
```

The first line here **declares** the variable ```n```, but _does not_ give it a definition. Until a variable is defined, it has a **null** value until it is defined. In Java, all data begins its life as null (or empty, or void) until it is defined. 

In this case, ```n``` is null until it is defined as the integer ```1``` in the following line ```n = 1;```. Note that in this second line, we _do not_ repeat ```n```'s type of ```int```. The ```int``` label is strictly part of the declaration. Any time data is declared in Java, it must be assigned a **data type**. 

### Never Redeclare existing variables
Once data is declared, its data type _cannot_ be changed. Java will not allow it. As long as this variable ```n``` persists, we will never redeclare it as ```int n```. We will only reassign it (or redefine it) using ```n = someValue```.

So if we use n in a loop, it should look like this:

```java
    //CORRECT CODE
    int n = 0;
    while(n < 10) {
        System.out.println(n);
        n = n + 1;
    }
```

It should NOT look like this:

```java
    //INCORRECT CODE
    int n = 0;
    while(n < 10) {
        System.out.println(n);
        int n = n + 1;
    }
```

Java will not allow us to re-declare a variable that already exists. In the above instance, we try to re-declare ```n``` as an integer inside the loop, even though we already declared it before the loop.

### Declaration without Definition
Note that we _can_ declare variables without defining them, and there are times when we want to do this. Remember our basic ```for``` loop:

```java
    for(int i = 0; i < 10; i++) {
        System.out.println(i);
    }
```

We _declare_ and _define_ the ```int i``` within the condition of the for loop, but we could pull the declaration out of the for loop.

```java
    int i;
    for(i = 0; i < 10; i++) {
        System.out.println(i);
    }
```

This works, but let's look at a similar ```while``` loop that does NOT work:

```java
    int n;
    while(n < 10) {
        System.out.println(n);
        n++;
    }
```

Here, we declare n, but we don't define it. When our while loop tries to compare n with the condition ```n < 10```, it fails because n is still ```null```. ```null < 10``` is an invalid statement. We do not have to define variables when we declare them, but we _do_ have to define them before we try to _use_ them.

## The Life of a Variable
### Birth (Declaration)
Data does not exist until you **declare** it. A variable's declaration could be called its _birth_. The following code does not work:

```java
    //INCORRECT CODE
    while(n < 10) {
        System.out.println(n);
        n++;
    }
```

We call on the variable ```n```, but we never declared it.

It turns out, however, that _where_ a variable is declared matters as well as _when_ a variable is declared. Look at the following code, which also doesn't work:

```java
    //INCORRECT CODE
    int n = 1;
    while(n < 10) {
        int x = n*n;
        System.out.println(x);
        n++;        
    }
    System,out.println(x);
```

Here we declare a variable ```int x``` inside of a while loop, then we try to print ```x``` after the while loop terminates. This code won't work because ```x``` _dies_ as soon as the while loop ends. Because ```x``` is defined within the while loop, its **scope** is limited to that while loop. Once the while loop terminates, any data declared within its scope dies with it.

### Death (End of Scope)
When a variable is declared, its **scope** is limited within the confines of the its containing curly braces. Let's look at that loop again:

```java
    int n = 1;
    while(n < 10) {
        int x = n*n;
        System.out.println(x);
        n++;        
    }
``` 

We have two variables with different scopes here. ```n``` is declared outside of the ```while``` loop, so its scope is bigger than the loop. If we want to print ```n``` after the loop completes, that will work just fine.

```x```, on the other hand, is declared within the while loop. The while loop has an opening and closing curly brace (```{ }```) which define its scope. Any variables declared within the loop only exist until we exit those curly braces.

Note that this works just fine:

```java
    int n = 1;
    while(n < 10) {
        int x = n*n;
        if(x < 10){
            x *= x;
        }
        System.out.println(x);
        n++;        
    }
``` 

Even though there is a closing curly brace inbetween the declaration of ```x``` and our print statement, that curly brace is closing the ```if``` segment, not the ```while``` loop. ```x```'s scope is set within the ```while``` loop, so any call to ```x``` is fine until we pass the curly brace that terminates the ```while``` loop.

## Temporary out of Scope



```java
    //INCORRECT CODE
    
```
