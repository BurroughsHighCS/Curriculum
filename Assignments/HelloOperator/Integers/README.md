# Working with Integers

## Terminology
* Integer
* Primitive
* Class
* Function


## Examples & Explanations
```java
int currentYear = 2018;
int yearsUntilGraduation = -11;
int myHSGradYear = currentYear + yearsUntilGraduation;

System.out.println("I graduated High School in " + myHSGradYear);
```

An **Integer** is any **whole** number between -&#221E and $#221E. In Java, we can create integers using the **primitive** data type ```int```.

### What's a Primitive?
In Java, most of the data types you use for your variables will be **Objects** (another name for Java Classes). The difference between an Object and a Primitive is that an Object can have helper functions. Whoever designed the String class could have written an ```isNumber``` function for Strings:

```java
String num = "10";
if(num.isNumber()) {
    System.out.println("My String is a Number.");
}
```

See the ```num.isNumber()``` there? That's a **Function** call. In this case, we ask the String class to call a function inside of it called ```isNum```. We'll talk more about class functions later. In this case, the Java String class doesn't actually have an "isNumber" function, but it _could_, because it's an object.

```java
int num = 10;
if(num.isEven()) {
    System.out.println("My integer is even.");    
}
```

This code doesn't work. ```int``` is a primitive data type. This means it stores data, but doesn't provide any helper functions for that data.

Java actually _does_ have an ```Integer``` class that we could use instead.

```java
Integer num = 10;
if(num.isEven()) {
    System.out.println("My integer is even.");        
}
```

This code _could_ work if the ```Integer``` class had an ```isEven``` function. Because ```Integer``` is a class, not a primitive, it could have helper functions built into it.

A good way to know the difference between Classes and Primitives is to look at capitalization. In Java, all Classes should have their first letter capitalized, while all primitives are lower case.

