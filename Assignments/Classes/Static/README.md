# Static Classes
Oftentimes, we factor utility functions out into classes called *static classes*. Remember how we are always defining class variables as `public static int n ...` and functions as `public static void main(...)`? Well that `static` declaration means that the function will be accessible at the class level without having to construct an instance of the class.

That last part probably sounds a little like gibberish, but that's okay. As we continue talking about classes, you will start to see what **static access** means, and why it is significant.

## Utility Classes
In the `utils` folder here, you will find two utility classes: `MatrixUtil.java` and `SentenceUtil.java`.

SentenceUtil:

```Java
package utils;

import java.util.ArrayList;

public class SentenceUtil {
    private static String[] subjects = {"I", "He", "She", "That guy", "Whatshername", "The dog"};
    private static String[] objects = {"the dog", "a ball", "my keyboard", "a door", "the desk"};
    private static String[] verbs = {"kicked", "bought", "ran into", "fell off of", "tried to jump across"};

    public static String generateSentence() {
        String sentence = "";
        sentence += getRandomSubject() + " ";
        sentence += getRandomVerb() + " ";
        sentence += getRandomObject() + ".";

        return sentence;
    }

    private static String getRandomSubject() {
        int selection = (int) (Math.random() * (double) subjects.length);
        return subjects[selection];
    }

    private static String getRandomVerb() {
        int selection = (int) (Math.random() * (double) verbs.length);
        return verbs[selection];
    }

    private static String getRandomObject() {
        int selection = (int) (Math.random() * (double) objects.length);
        return objects[selection];
    }
}
```

Some notes here now that we're working in separate classes:

### Public vs. Private
Not everything is scoped for `public` access. Many of our declarations scope for `private` access.

* A variable or function is declared as `public` if it must be accessible from **outside the class**.
* A variable or function is declared as `private` if it should _only_ be accessible from **within the class**.

If you look at the `Example.java` file in this folder, you will see a `sentenceExample()` function:

```Java
    public static void sentenceExample() {
        String sentence = SentenceUtil.generateSentence();
        System.out.println(sentence);
    }
```

The only function it calls from the `SentenceUtil` class is `generateSentence()`. If you look back up at the `SentenceUtil` static class, you will see that `generateSentence()` is the only `public` function in the entire class.

Because everything else is `private`, we can't access it from outside the class.

```Java
    public static void sentenceExample() {
        //All of these fail
        String s1 = SentenceUtil.getRandomSubject();
        String s2 = SentenceUtil.getRandomVerb();
        String s3 = SentenceUtil.getRandomObject();
    }
```

Even though the return type is correct and the function is written correctly, we are unable to call a class's private functions from outside the class.

However, if you look at the `generateSentence()` function inside the `SentenceUtil` class, it calls those functions just fine:

```Java
    public static String generateSentence() {
        String sentence = "";
        sentence += getRandomSubject() + " ";
        sentence += getRandomVerb() + " ";
        sentence += getRandomObject() + ".";

        return sentence;
    }
```

When we write code that is necessary to make a class function, but we don't want that code to be used outside of its intended purpose, we label it as `private`. If we decide that we want the `SentenceUtil` class to be able to return random subjects, objects, and verbs to other classes, however, we could easily relabel those functions as `public` to open them up.

### Single Responsibility Design
We could have easily written all of our utility functions inside of a single class. There's no reason why we _need_ to move the random sentence generator into its own class. If we copy paste that code into our `Example` class and make some minor modifications to fix syntax, it would be easy to get it all in one place.

But what if our program does more than just make random sentences? What if that's just one of its many features?

In this case, we have a second example that uses the `MatrixUtil` class to perform some operations on 2-dimensional arrays. If we tried to move all of those matrix functions into the `Example` class, you could see how it would get cluttered quickly, making it difficult to read and understand.

Good programmers stick to a model of design called **Single Responsibility Design**.

The idea here is simple: You should deconstruct your program to its most basic components and place each of those components into its own class.

Need to perform a bunch of mathematical operations? Make a class called `Math` or `MathUtils` (Java already has a Math class for this exact reason. It has functions like `random()` for random number generation and `pow` for performing exponential arithemetic).

Need to perform a bunch of grammar related operations? Make a `Grammar` class with methods like `public static Boolean checkRunOn(String sentence)`.

By factoring these repeatable operations out into separate, smaller classes we make our code easier to read and easier to maintain. When working on large projects, single responsibility design is critical.

### Packages and Importing
This isn't critical for the AP exam, but it's important if you ever want to write your own multi-class projects.

Remember when we used Java's `Scanner` class to read in user inputs from the terminal? We had to put an `import java.util.Scanner;` statement at the top of our file (before the class declaration).

Similarly, when we write our own custom classes, we need to import them. In this case, all of our utility classes are stored in a `utils` folder and labeled with the `package utils;` statement at the top of their files:

```Java
package utils;

public class SentenceUtil {
    //...
}
```

Then in order to import those utility functions in our `Example` class, we write the necessary import statement:

```Java
import utils.*;

class Example {
    //...
}
```

In this case, we import `utils.*`, which means "import _everything_ in the utils package". We could have just imported the SentenceUtil class if that was all we needed: `import utils.SentenceUtil`.

## Exercises

### [Exercise 1](./Exercise1.md)
