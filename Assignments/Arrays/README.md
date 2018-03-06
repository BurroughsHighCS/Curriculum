# Arrays
Imagine for the Plinko project that you had to store 9 different variables for the number of discs that land in each slot:
```Java
    int numInSlot0 = 0;
    int numInSlot1 = 0;
    int numInSlot2 = 0;
    int numInSlot3 = 0;
    int numInSlot4 = 0;
    int numInSlot5 = 0;
    int numInSlot6 = 0;
    int numInSlot7 = 0;
    int numInSlot8 = 0;
```

Each time you need to increment one of the slots, you have to use a giant if/else chain to update your data:

```Java
    if(position == 0) {
        numInSlot0++;
    } else if (position == 1) {
        numInSlot1++;
    } // And so on...
```

You can do this. It will work. But please don't.

We can accomplish the same thing much easier with Arrays:

```Java
    int[] slotArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    //Increment slots based on final position of disc:
    slotArray[position]++;
```

Using an array shrinks that nasty block of variable definitions and the corresponding nightmare if/else chain into just _2 lines of code_.

## Terminology
* Array
* Index

## How to Use Arrays

### Creating Arrays
The first step to using an array is to initialize it.  We do this with the following syntax:
```Java
    int[] numArray = {0, 0, 0, 0};
```

The above code declares and defines an array called ```numArray``` with 4 values. We set each of those four values to 0. Notice the ```[]``` brackets after the ```int``` type. These brackets turn a singular data type into an array of that data type. You could do the same thing with any data type:

```Java
    double[] dblArray = {0, 0, 0, 0};
    String[] strArray = {"Hello", "Hi", "Hey"};
```

An array can be any size, but the size _must_ be declared when the array is initialized. Once and array is initialized, it _cannot shrink or grow with out being **completely re-defined**_.

```Java
    int[] array1 = {0,0,0,0} //An Array of four integers
    int[] array2 = {0,1,2,3,4,5,6,7,8,9} //An Array of 10 integers 
```

But what if we want to declare a really big array, with thousands of values? We shouldn't have to type all of those numbers out, and we don't. We can use the following syntax:

```Java
    int[] array1;
    array1 = new int[400] //An array of four hundred integers

    int[] array2 = new int[1000] //This syntax also works
```

For both of the above arrays, every single value in the array will start out as **zero**. So ```array1``` contains 400 zero's, and ```array2``` contains 1000 zero's.

## Reading and Manipulating Array Values
Storing data in an array is great, but we need to be able to read and update the data as well.

### Reading Array Values
Reading the values in an array is relatively simple:

```Java
    int[] numArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

    System.out.println( numArray[0] ); //Value at position 0 (1)
    System.out.println( numArray[1] ); //Value at position 1 (2)
    System.out.println( numArray[2] ); //Value at position 2 (4)
    System.out.println( numArray[3] ); //Value at position 3 (8)
    //...
```

Arrays are indexed starting at zero. This means that an array with 10 positions has 10 indices, or positions: Position 0, position 1, position 2, all the way to position 9.

The syntax to read the value at position **i** is ```arrayName[i]```. You can read this syntax out loud as "arrayName AT i"; short for "value of arrayName at position i"

### Manipulating / Updating Array Values
If we can read a value in an array, it turns out changing a value in an array isn't much more complex:

```Java
    int[] numArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

    System.out.println( numArray[0] ); //Prints 1

    numArray[0] = 1024;
    System.out.println( numArray[0] ); //Prints the new value, 1024
```

The line ```numArray[0] = 1024``` would read simply as "Assign 1024 to numArray AT 0". We reassign the value at position 0 from ```1``` to ```1024```, and our print statement will print ```1024```

Any assignment operator can be used to update values in an array:

```Java
    numArray[0]++;
    numArray[0]--;
    numArray[0] += 2;
    numArray[0] -= 2;
    numArray[0] *= 2;
    numArray[0] /= 2;
    numArray[0] %= 2;
```

## [Exercise](./Exercise.md)
You should have the tools needed to finish our array [exercise](./Exercise.md)
