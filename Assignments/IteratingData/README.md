# Iterating Over Data
Arrays allow us to store many similar items in a single data source. Loops, on the other hand, allow us to repeat identical actions multiple times with just a few lines of code. You will find many times that you need to combine the two of these.

## Terminology
* Iterate
* Data Collection
* Index

## Overview
Let's start by looking at a for loop that prints the first 32 powers of 2:
```Java
    int power; 

    for(int i = 0; i < 32; i++) {
        if(i == 0) {
            power = 1; //First power of 2
        }
        else {
            power *= 2; //Subsequent powers of 2
        }
        System.out.println(power);
    }
```

We can rewrite this loop using an array:

```Java
    int[] powers = new int[32];

    for(int i = 0; i < 32; i++) {
        if(i == 0) {
            powers[i] = 1;
        }
        else {
            powers[i] = powers[i-1] * 2;
        }

        System.out.println(power);
    }

```


