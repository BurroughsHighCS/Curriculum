# Collecting User Input
While this material won't be tested on the AP exam, it is useful to know how to collect user input. 

## The Scanner Class
Different languages have different strategies for reading user input. In Java, we use what is called the `Scanner` class.

```java
import java.util.Scanner;

class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		while(true) {
			if(Scan.hasNextLine()) {
				userInput = scan.nextLine();
			}
		}
	}
}
```

### Scanner is a class. 
We haven't talked much about classes yet, but it's relevant here to note that it is a class for a few reasons:

We have to import it. Imagine that you had a separate file called `Scanner.java` that defined a Scanner class. We do this *outside* of our working file's class:

```java
import java.util.Scanner;
```

We have to create what is called an **instance** of the `Scanner` class:

```java
Scanner scan = new Scanner(System.in);
```

The Scanner class can be configured to read lots of different kinds of inputs. Our scanner here is configured to read from `System.in`, which is this opposite of `System.out`, or the terminals text buffer. We've been using this all semester with `System.out.println` and `System.out.print`.

## The template
The basic model of collecting user input is to use a `while(!isValid)` loop or a `while(true)` loop.

### while(!isValid)
Let's assume we want the user to provide an integer that is greater than zero. The following would ask for that:

```java
int userInput = -1;
Boolean isValidInput = false;
while(!isValidInput) {
	System.out.print("Enter a positive integer valkue: ");
	if(scan.hasNextInt()) {
		int test = scan.nextInt();
		if(test > 0) {
			//A valid input has been provided.
			userInput = test;
			isValidInput = true;
		}
	}
}
```

In the above loop, we keep asking for the user to provide a positive integer. Each time the user provides a value, we check to see if it's positive. If it *is*, then we set the `isValidInput` Boolean to `true`, causing our loop to terminate.

If the user's input is *not* valid, then we leave `isValidInput` as false and our loop will ask the user for an input again.

### while(true)
We can write the same statement using the `while(true)` model:

```java
int userInput = -1;
while(true) {
	System.out.print("Enter a positive integer valkue: ");
	if(scan.hasNextInt()) {
		int test = scan.nextInt();
		if(test > 0) {
			//A valid input has been provided.
			userInput = test;
			break;
		}
	}
}
```

## Functions on the Scanner class
The `Scanner` class has a lot of different functions. We have used a few of them here in this example:

* `hasNextLine` - Is the user inputted value a full line? (Boolean)
* `nextLine` - Grab the next line from the user input (String)
* `hasNextInt` - Is the user inputted value a valid integer? (Boolean)
* `nextInt` - Grab the next integer from the user input (int)

There are others for other data types:

* `hasNextDouble`
* `nextDouble`
* `hasNextBoolean`
* `nextBoolean`

## Exercise
Revist your `DiceGame` class, and rewrite it so that the user selects how many sides they want their dice to have.

You may want to write a new `rollNSidedDie` function that rolls a dice with as many sides as the user requested.