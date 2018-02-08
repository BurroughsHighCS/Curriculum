# Boolean Logic

## Terminology
* Binary (Boolean) Logic
* Boolean
* Conditional
    * if
    * else if
    * else

## Binary Logic
Generally, when we use the term "Logic" in this class, we are talking about **Binary Logic**. Binary Logic encompasses a whole world of math relating to calculations that can be done with just the numbers 0 and 1. We often replace 0 with ```false``` and 1 with ```true```.

These values, ```true``` and ```false``` are called **Booleans** in programming languages.

```java
    Boolean isDesert = true;
    Boolean haveAC = true;
    Boolean haveSwampCooler = false;
```

The most common use case of Booleans is in what we call **Conditionals**:

```java
    Boolean isDesert = true;
    Boolean haveAC = true;
    Boolean haveSwampCooler = false;

    if(isDesert) {
        if(haveAC) {
            System.out.println("Your electric bill is high.");
        }
        else if(haveSwampCooler) {
            System.out.println("Your electric bill isn't too bad.");
            System.out.println("Your house gets humid.");
        }
        else {
            //Default case
            System.out.println("How do you survive here?");
        }
    }
    else {
        //Default case
        System.out.println("Your electric bill might be good or bad, but I'm not sure.")
    }
```

Above is an example of a series of conditional statements. By toggling the top three Boolean variables between ```true``` and ```false```, our program will execute different print statements based on our conditions. Using the Booleans as provided above, it will hit the first print statement, ```System.out.println("Your electric bill is high.");```. Can you figure out the necessary conditions to reach each of the possible outcomes?

### Logical Operators
Boolean variables aren't the only conditions that can be placed inside of conditional statements. There are many **Logical Operators** that return ```true``` and ```false``` values:

* ```==``` - Equality Comparison Operator
* ```!=``` - Inequality Comparison Operator
* ```<``` - Less Than Comparison Operator
* ```<=``` - Less Than or Equal To Comparison Operator
* ```>``` - Greater Than Comparison Operator
* ```>=``` - Greater Than or Equal To Comparison Operator
* ```&&``` - AND Operator
* ```||``` - OR Operator (These pipe bars are typed using the capital backslash key)

```java
    double wallet = 25.00;
    if(wallet != 0) {
        if(wallet >= 10) {
            System.out.println("I can afford some fast food.");
            if (wallet > 30) {
                System.out.println("I can afford a nice restaurant.");            
            }
        }
        if(wallet >= 20 && wallet <= 30) {
            System.out.println("I could buy fast food for just one or two friends.")            
        }
        if(wallet % 5 == 0) {
            System.out.println("The money in my wallet is divisible by 5.")
        }
        if(wallet % 2 != 0) {
            System.out.println("The amount of money in my wallet is and odd number.")
        }
    }
    else {
        System.out.println("I'm broke as a joke.");
    }
```

The above snippet shows a bunch of possible Boolean conditions. Note that many of the statements above aren't followed by an ```else``` case. The else case is not required. Often you want to do something if a condition exists, but you don't want to do anything if that condition doesn't exist.

### Else If
Many if statements are followed by other conditions. Sometimes those conditions are ```else if``` conditions:

```java
    double wallet = 0;
    double creditCardBalance = 0;
    double mealPrice = 8.25;

    if(wallet > mealPrice) {
        System.out.println("Pay with cash.");       
    }
    else if (creditCardBalance < 50) {
        System.out.println("Pay with credit.");
    }
    else {
        System.out.println("Go hungry.");
    }
```

In this snippet, the middle case of "Pay with credit" will _only_ be executed if the first condition is ```false``` AND the second condition is ```true```. Your credit card balance may be less than $50, but you don't want to pay with credit if you've already paid with cash.

Alternatively, if you look again at the first snippet of wallet code:

```java
    double wallet = 25.00;
    if(wallet != 0) {
        if(wallet >= 10) {
            System.out.println("I can afford some fast food.");
            if (wallet > 30) {
                System.out.println("I can afford a nice restaurant.");            
            }
        }
        if(wallet >= 20 && wallet <= 30) {
            System.out.println("I could buy fast food for just one or two friends.")            
        }
        if(wallet % 5 == 0) {
            System.out.println("The money in my wallet is divisible by 5.")
        }
        if(wallet % 2 != 0) {
            System.out.println("The amount of money in my wallet is and odd number.")
        }
    }
    else {
        System.out.println("I'm broke as a joke.");
    }
```

You can note that _none_ of these conditionals are ```else if``` conditionals. It is possible (and even likely) that _many_ of these conditions are true, in which case _all_ of the true statements will execute. This makes sense, because most of these print statements are not exclusive actions, but just statements of non-exclusive facts. Being able to afford fast food doesn't mean that the money in my wallet _isn't_ divisible by 5 or by 2. Likewise, if I have $10, $20, $30... in my wallet, these amounts are divisible by both 2 AND 5.
