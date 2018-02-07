# Strings

## Terminology
* String
* Operator
* Assignment
* Concatenation
* Print Statement
* Variable
* Literal

## Examples & Explanations
```Java
String firstName = "Curt";
String lastName = "Merrell";
```

Simply put, a **string** is any line of text, or a "string" of text. Strings don't have to be individual words, though. We can also write

```java
String fullName = "Curt Merrell";
```

Or we can get fancy:

```Java
String firstName = "Curt";
String lastName = "Merrell";

String fullName = firstName + " " + lastName;
```

We use a lot of math symbols in these code snippets. You probably can understand what each of these statements are doing naturally, but in programming we use a new name for these symbols: **Operators**. An **operator** is a symbol that performs an operation on data. Let's list the operators used in the above snippets:
* **=** (Assignment)
* **+** (Concatenation)

First, note that we call the **=** sign in Java the "Assignment" operator, not the "Equals" operator. Let's read some of these "Assignment" statements the way they work as code:

```java
//Assign the value "Curt" to the String 'firstName'.
String firstName = "Curt";
//Assign the value "Merrell" to the String 'lastName'.
String lastName = "Merrell";

//Concatenate the values stored in Strings 'firstName' and 'lastName' with a space between
//Store the result in the String 'fullName'
String fullName = firstName + " " + lastName;
```

Notice that this last one has a **concanate** operation inside of it. You can think of **Concatenation** as the action of gluing two strings together. In this case, we're gluing three strings together (using two concatenation operations). We turn three separate strings: ```"Curt"```, ```" "```, and ```"Merrell"```, into one string: ```"Curt Merrell"```.

There are a lot of other details to learn about Strings, but this about covers the basics. Remember that you can print Strings to the console. This is what we did in our "Hello World" program:

```java
//Print Statement
System.out.println("Hello World");
```

We could just as easily do:

```java
//Print Statement
System.out.println("Curt Merrell");
```

Or, using our Strings that we assigned earlier:

```java
String firstName = "Curt";
String lastName = "Merrell";

String fullName = firstName + " " + lastName;

//Print Statements
System.out.println(firstName);
System.out.println(lastName);
System.out.println(fullName);
```

Notice that we don't wrap these Strings in Quotation marks in these print statements. There's an important distinction between printing ```fullName``` and ```"fullName"```.

### Variables vs. Literals
A **variable** is a data storage tool used to assign values that will persist across multiple lines of code. A **literal** has no permanence. Consider the line of code:

```java
String firstName = "Curt";
```

In this line of code, ```firstName``` is a String **variable**. We are assigning a value to ```firstName``` so we can use it later. It doesn't store it forever. We will talk about variable permanence and variable scoping later. What are we assigning to ```firstName```? The String literal "Curt".

Look at the following print statements:

```java
String firstName = "Curt";

System.out.println(firstName); //Prints "Curt" (We told it to print the value of an assigned variable)
System.out.println("firstName"); //Prints "firstName" (we told it print a String literal)
System.out.println("Curt"); //Prints "Curt" (Again, a String literal)
System.out.println(Curt); //This throws an error. We tried to tell it to print the value of a variable named "Curt", but we never declared this variable or assigned any value to it.
```

This covers the basics of Strings for now. There are other nuances to working with strings, but for now this this get you started.
