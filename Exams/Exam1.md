1. Vehicle License plates can only contain the characters 0-9 and A-Z. This combined character range forms a base-36 number system. How many unique license plates can be made if each license plate has 7 characters. In other words, what's the **maximum number of values** represented within **7 digits of a base-36** number system?

```
    (A) 36 * 7 (252)
    (B) 36^7 (~7.8E11 or 78 Billion)
    (D) 36^7 - 1
    (C) 7^36 (~2.6E30 or 2.6 nonillion (9-illion))
    (E) 7^36 - 1
```
_____________________________

2. Each character in a Java `String` by combining several `char` data type characters together. A `char` data type can represent any character from the ASCII standard, which contains 128 unique characters represented using the values 0-127. How many bits (binary digits) would be needed to represent the string **"Java"**?

```
    (A) 7
    (B) 6
    (C) 9
    (D) 24
    (E) 28
```

_____________________________

3. Consider the following `isPrime()` function, which should take a parameter of type `int` and return `true` if the provided integer is a prime number, and `false` if it is not:

```Java
    public static Boolean isPrime(int x) {
        int lowerBound = /* Some Value */;
        int upperBound = /* Some Value */;
        for(int i = lowerBound; i < upperBound; i++) {
            if( x % i == 0 ) {
                return false;
            }
        }
        return true;
    }
```

What should the values `lowerBound` and `upperBound` be to test if a number is prime or not?

```
    (A) lowerBound = 0; upperBound = x;
    (B) lowerBound = 1; upperBound = x;
    (C) lowerBound = 2; upperBound = x;
    (E) lowerBound = 1; upperBound = x-1;
    (E) lowerBound = 2; upperBound = x-1;
```

_____________________________

4. Consider the following `findMax()` function, which should take an array of type `int[]` as a parameter and return the **first index** of the largest value in the array:

```java
    /** Precondition: numArray.length > 0
     *  @return: The FIRST index of the largest value in the array
     */
    public static int findMax(int[] numArray) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < numArray.length; i++) {
            if( numArray[i] > max) {
                max = numArray[i];
                index = i;
            }
        }

        return index;
    }
```

When is the `findMax` function above NOT guaranteed to return the correct index?

```
    (A) The largest value in numArray is in numArray[0].
    (B) The largest value in numArray is a negative number.
    (A) The largest value in numArray is in numArray[numArray.length - 1].
    (C) The largest value in numArray occurs more than once.
    (D) It is never guaranteed to return the correct index.
```

_____________________________

5. Assume that `x` and `y` are valid `Boolean` variables.

```Java
    !(x || y) && !y
```

Which of the following always evaluates to the same value as above?

```
    (A) !x && !y
    (B) x || y
    (C) x || !y
    (D) !(x && y)
    (E) x && y
```

_____________________________

6. What will the following code segment print?

```Java
    for(int i = 0; i < 3; i++) {
        for(int j = i; j < 3; j++) {
            System.out.print('@');
        }
        for(int j = 0; j < i; j++) {
            System.out.print('#')
        }
        System.out.println();
    }
```

```
    (A) @@#
        @##
        ###

    (B) ###
        ##@
        #@@

    (C) #@@
        @@#
        #@@

    (D) @@@
        @@#
        @##

    (E) ##@
        #@@
        @@@
```

_____________________________

7. Assume that a coin, when flipped, has an equal probabiliy of landing with either "Heads" or "Tails" face up. The following incomplete code attempts to compute the value number of "Heads" values that occur when flipping a coin **n** times:

Which of the following code segmetns would best simulate the number of "Heads" values for flipping the coin **n** times?

```
    (A) int numHeads = n * (int) (Math.random() * 2);
    (B) ```Java
            int numHeads = 0;
            for(int i = 0; i < n; i++) {
                int num = Math.random() * 2;
                if(num == 1) {
                    numHeads++;
                }
            }
        ```
    (C) ```Java
            int numHeads = 0;
            for(int i = 0; i < n; i++) {
                if(Math.random() > .5) {
                    numHeads++;
                }
            }
        ```
    (D) B and C
    (E) All of the above.
```

_____________________________

8. Consider the following loop, where n is some positive integer:

```java
    for(int i = 0; i < n; i += 2) {
        if(/* test */)
            /* perform some action */
    }
```

In terms of `n`, which Java expression represents the **maximum** number of times that `/* perform some action */` could be executed?

```
    (A) n / 2
    (B) (n + 1) / 2
    (C) n
    (D) n - 1
    (E) n - 1 / 2
```

_____________________________

9. Consider the following instance variable and method:

```Java
    private int[] numbers;

    public void mystery(int x, int y) {
        for(int i = x; i < numbers.length; i += y) {
            numbers[i] = numbers[i] * (x + y)
        }
    }
```

Assume the `numbers` array has been initialized with the following values:

```Java
    {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
```

Which of the following lists the correct values of the numbers array after executing `mystery(2, 3)`?

```
    (A) {10, 20, 30, 200, 50, 300, 70, 400, 90, 500}
    (B) {10, 20, 150, 40, 50, 300, 70, 80, 450, 100}
    (C) {10, 20, 35, 40, 50, 65, 70, 80, 95, 100}
    (D) {10, 100, 30, 40, 250, 60, 70, 400, 90, 100}
    (E) {10, 20, 150, 40, 250, 60, 350, 80, 450, 100}
```

_____________________________

10. What is printed as a result of executing the following statement?

```Java
    System.out.println(3563 / 100 * 2 + 16);
```
```
        (A) 1
        (B) 85
        (C) 33
        (D) 34
        (E) 86
```