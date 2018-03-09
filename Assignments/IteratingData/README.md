# Iterating Over Data
Arrays allow us to store many similar items in a single data source. Loops, on the other hand, allow us to repeat identical actions multiple times with just a few lines of code. You will find many times that you need to combine the two of these.

## Terminology
* Iterate
* Index
* Foreach

## Overview
Let's start by looking at a for loop that uses an array to print the first 10 powers of 2:

```Java
    int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512}

    for(int i = 0; i < powers.length; i++) {
        System.out.println(powers[i]);
    }
```

This for loop **iterates** over all the values inside the ```powers``` array to print each of those values. Take a look at the executing condition of this for loop: ```i < powers.length```. Arrays have a length property that returns the number of values they contain. We added 10 values to our ```powers``` array, so ```powers.length``` will return 10.

Some key notes to remember about ```array.length```:
* While ```powers.length``` returns 10, the first value (1) in the ```powers``` array is stored at **index 0**: ```powers[0]```, and the last value (512) is stored at **index 9**: ```powers[9]```. There is no ```powers[10]``` even though powers has a length of 10.
    * ```arrayName[arrayName.length - 1]```: We can quickly access that last value stored in any array by looking at the item in position ```arrayName.length - 1```. It does not matter what size the array is, this will always look at the last item in the array.
    * ```arrayName[arrayName.length]```: This will _always_ throw an out of bounds error for any array. Remember, if an array has a length of **10**, it's last position will be at index **9**.

### Populating Arrays With for Loops
Assume we want to store the first 32 powers of 2 into an array, instead of just the first 10. We could look them up in a calculator and write them all into an array individually, but we can do it quicker with a for loop.

First, lets declare an array of size 32:

```Java
    int powers = new int[32];
```

Remember, when we declare an array this way, _all_ of its values begin as 0's. In our array, each position will represent that power of two.

* ```powers[0]``` should be 2 to the 0.
* ```powers[1]``` should be 2 to the 1.
* And so on...

Since 2 to the 0 is 1, lets go ahead and set that outright:

```Java
    int powers = new int[32];

    powers[0] = 1;
```

Now, for every subsequent value, we want to multiply the preceding value by 2: ```powers[n] = powers[n-1] * 2```. We can put this into a for loop:

```Java
    int powers = new int[32];

    powers[0] = 1;

    for(int i = 1; i < powers.length; i++) {
        powers[i] = powers[i - 1] * 2;
    }
```

Note that we begin our loop at ```i = 1```. There are two reasons we have to do this:
* We already declared ```powers[0]```, so we don't need to start at index 0.
* If ```powers[i] = powers[i - 1] * 2```, we _can't_ start at position 0. We would try to set ```power[0]``` to ```powers[-1] * 2```. No array will ever have a value stored at index -1.

## Another Type of For Loop
In Java ```for``` loops have an alternative syntax referred to as the ```foreach``` loop. This syntax functions slightly differently than a standard ```for``` loop, and is only available if we have an array or other collection to **iterate** over.

Consider our first loop with the powers of 2:

```Java
    int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512}

    for(int i = 0; i < powers.length; i++) {
        System.out.println(powers[i]);
    }
```

We can actually rewrite this loop as a ```foreach``` loop:

```Java
    int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512}

    for(int value : powers) {
        System.out.println(value);
    }    
```

The syntax changes quite a bit:
* The code ```for(int value : powers)``` is read out loud as "For each integer (called value) in the powers array".
* Despite being called a ```foreach``` loop, Java still uses ```for(..)``` to declare a foreach loop.
* Instead of having the **index**, **executing condition**, and **mutating operator**, a ```foreach``` loop declares the following:
    * The **Iteration Variable**: ```int value```
    * The **Targeted Array**: ```powers```

### The Iteration Variable
Imagine that our normal ```for``` loop looked like this instead: 

```Java
    for(int i = 0; i < powers.length; i++) {
        int value = powers[i];
        System.out.println(value);
    }
```

The ```foreach``` loop works more like this. A foreach loop assumes that the first thing you would do in a normal loop is make a new variable assigned to the array value stored at position **i**. It then does all of that for you inside its looping condition.

It converts:

```Java
    for(int i = 0; i < powers.length; i++) {
        int value = powers[i];
        //...
    }
```

Into:

```Java
    for(int value : powers) {
        //...
    }
```

That's _much_ easier to write (and read)!

### Names Can Change
```int value``` and ```powers``` can be replaced with other values. Look at the following example:

```Java
    String[] greetings = {"Hello", "Hi", "Hey", "Yo", "Sup"}

    for(String greeting : greetings) {
        System.out.println(greeting);
    }
```

Instead of a ```powers``` array, we have a ```greetings``` array. In our ```foreach``` loop, this becomes the **Targeted Array**. Instead of ```int value``` as an **iteration variable**, we have ```String greeting```. It's as if we took the loop:

```Java
    for(int i = 0; i < greetings.length; i++) {
        String greeting = greetings[i];
        //...
    }
```

And shortened it down to:

```Java
    for(String greeting : greetings) {
        //...
    }
```

## Assignment [Exercise](./Exercise.md)
You are now prepared to do the [exercise](./Exercise.md) to practice iterating over data.