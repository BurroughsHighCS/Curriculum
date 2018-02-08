# Integers and Doubles

## Terminology
* Integer
* Modulo
* Double

## Integers
```java
int currentYear = 2018;
int yearsUntilGraduation = -11;
int myHSGradYear = currentYear + yearsUntilGraduation;

System.out.println("I graduated High School in " + myHSGradYear); //Prints: I graduated High School in 2007
```

An **Integer** is any **whole** number between -&#8734; and &#8734;. In Java, we can create integers using the **primitive** data type ```int```.

### Integer Math
You can perform some basic mathematical operations on integers using the following mathematical operators:

* ```+``` - Addition Operator
* ```-``` - Subtraction Operator
* ```*``` - Multiplication Operator
* ```/``` - Division Operator
* ```%``` - Modulo (Remainder) Operator

```java
    int ten = 10;

    System.out.println(ten + 1); //11
    System.out.println(ten - 1); //9
    System.out.println(ten * 2); //20
    System.out.println(ten / 2); //5
```

All of these operations will print what you would expect them to (what's shown in the comment at the end of each line). But here's an odd one:

```java
    int ten = 10;

    System.out.println(ten / 4)
```

10 divided by 4 is 2.5, but remember how Integers are **whole** numbers? 2.5 isn't a valid integer, so Java will just print ```2``` here.

Wait. Why 2? Don't we normally round 2.5 up to 3? As it turns out, integer data types don't actually *round* mixed numbers up or down. They just *ignore* anything after the decimal point.

```java
    //Integer 'rounding'
    2.001 -> 2
    2.5 -> 2
    2.999 -> 2
```

Integers *always* 'round' down, if you want to think of it that way. Really, integers just can't be bothered to consider anything after the decimal point, so they just throw it away.

#### Modulo
We mentioned one more integer math operator in the list up above that you may not have recognized, the **modulo**, ```%```.

```java
    System.out.println(15 % 5); //0
    System.out.println(14 % 5); //4
    System.out.println(13 % 5); //3
    System.out.println(12 % 5); //2
    System.out.println(11 % 5); //1
    System.out.println(10 % 5); //0
```

The modulo performs integer division, but returns the remainder, instead of the whole number result. This gets used for some pretty important calculations:

```java
    public Boolean isEven(int x) {
        return x % 2 == 0;
    }
```

We haven't covered functions or logical operators yet, so some of the code above may seem a bit alien. The code above shows an implementation of a **function** called ```isEven```. This function takes an integer as a parameter and returns ```true``` if the provided integer is evenly divisble by 2, or ```false``` if it isn't:

```java
    isEven(10); //true. 10 % 2 is 0
    isEven(11); //false. 11 % 2 is 1
```

Note that this implementation of the ```isEven``` function will also return ```true``` for 0. ```0 % 2 == 0```.

## Doubles
Integers won't store fractions, so what happens when we *want* our math to accommodate fractions? In this case, we have to use the **double** data type:

```java
    double foodCost = 24.50;
    int numPeople = 4;
    double costPerPerson = cost / numPeople;

    System.out.println("Our meal costs " + costPerPerson + " per person.");
```

**Double** math allows for fractions inbetween whole numbers, so it works perfect for calculating things like percentages and costs, or anything else where you would expect to get fractions as part of your result.

Note in the above example that we still store the number of people as and int, ```int numPeople```. You'll never really have a half of a person, so you should still store numPeople as an int. Technically, you could store ```numPeople``` as a double and it would still work, but there are rare occassions in most programming languages where doubles have slight rounding errors. If your math gets complex enough, you might get an operation that returns the number ```8.00000000000000000001``` when really the number should just be ```8```. These rounding errors are rare, and only happen at *very* small fractions, so they should be inconsequential for most mathematical operations.

For most cases, you should recognize based on the data you are using whether an ```int``` or a ```double``` is the appropriate data type (eg. People should always be integers, and cost should always be doubles). You might have a situation where you divide two integers and expect a double as the result:

```java
    int numWorkers = 4;
    int numDays = 25;
    double daysPerWorker = numDays / numWorkers;

    System.out.println("This job requires " + daysPerWorker + " per worker");
```

The above code doesn't work as desired. We want it to print ```6.25```, but it prints ```6.0``` because we did our math with *integers*, then assigned the *integer* result to a double. Before we assigned the result to the double, the integer had already thrown away the remainder. To fix this, we have two options:

```java
    //Option 1:
    int numWorkers = 4;
    double numDays = 25;
    double daysPerWorker = numDays / numWorkers;

    System.out.println("This job requires " + daysPerWorker + " per worker");
```

Maybe we never intend to use partial days, but the idea of "half a day" makes sense, so we can just change ```numDays``` to a double and that works. Any math operation between a double and an int will result in a double.

```java
    //Option 2:
    int numWorkers = 4;
    int numDays = 25;
    double daysPerWorker = (double) numDays / numWorkers;

    System.out.println("This job requires " + daysPerWorker + " per worker");    
```

Maybe we want to be sticklers about the idea that our function will only ever begin with *whole* days. In this case, we can leave ```numDays``` as an integer, and just tell the program to treat it *as if* it were a double when calculating ```daysPerWorker```. In this case, numDays is still an integer, but we can treat it like a double when we do a math operation where we expect it to yield a fraction as part of the result. This uses a technique called **Typecasting** which we will talk more about later.

## Special Operators
There are some special mathematical operators. First, you can combine any of the basic mathematical operators with an assignment operator:

* ```+=``` - Add and assign operator
* ```-=``` - Subtract and assign operator
* ```*=``` - Multiply and assign operator
* ```/=``` - Divide and assign operator
* ```%=``` - Modulo and assign operator

Each of these operators serves as a shorthand for a longer operation. Let's assume that we have ```int x = 1;```:

* ```x += 1;``` Is equivalent to: ```x = x + 1;``` - Reassign ```x``` to be the result of ```x + 1```
* ```x -= 1;``` Is equivalent to: ```x = x - 1;``` - Reassign ```x``` to be the result of ```x - 1```
* ```x *= 2;``` Is equivalent to: ```x = x * 2;``` - Reassign ```x``` to be the result of ```x * 2```
* ```x /= 2;``` Is equivalent to: ```x = x / 2;``` - Reassign ```x``` to be the result of ```x / 2```
* ```x %= 2;``` Is equivalent to: ```x = x % 2;``` - Reassign ```x``` to be the result of ```x % 2```

There are two more special operators you will use alot:

* ```++``` - Increment by 1
* ```--``` - Decrement by 1

Assuming we have ```int x = 1;``` again:

* ```x++``` Is equivalent to: ```x += 1``` Which is also equivalent to ```x = x + 1```
* ```x--``` Is equivalent to: ```x -= 1``` Which is also equivalent to ```x = x - 1```
