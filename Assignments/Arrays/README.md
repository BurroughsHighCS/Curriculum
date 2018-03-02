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