# Binary & Base-n Number Systems
This readme should not be considered a comprehensive explanation of Binary numbers. It just contains some notes that accent information I have taught in class. Unfortunately I don't have enough time to provide a complete written explanation of binary numbers. If you need help any aditional explanation about binary numbers beyond what you find here, you will need to bring questions to me during my office hours.

## Decimal Numbers
Our normal number system (i.e. - 1, 2, 3, ..., 8, 9, 10) is a **Base-10** Number System. This means that each digit in a given number represents 10 possible increments to that digit. First let's count up through the first 10 integers of our number system, 0-9:

```
"1"s digit:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9
```

10 comes after 9, but the number 10 is written as _two digits_, a 1 and a 0. This is the result of an **overflow** in our "1"s digit. The number ```10``` is too big to fit in a single base-10 digit. It _overflows_ from the "1"s digit and into the "10"s digit. From there we can continue counting up until the "10"s digit also overflows:

```
"10"s digit:
00, 10, 20, 30, 40, 50, 60, 70, 80, 90
```

If we add one more to the "10"s digit, it will overflow into the "100"s digit, and so on.

### Powers of Ten
Another way to see the digits in our decimal number system is as the various **Powers of Ten**.

The number **347** could be re-written as follows (The notation ^n represents "to the power of n"):

```(7 * 10^0) + (4 * 10^1) + (3 * 10^2)```

* The "1"s or "Ones" digit represents how many multiples of 1 (10^0) are in our number.
* The "10"s or "Tens" digit represents how many multiples of 10 (10^1) are in our number.
* The "100"s or "Hundreds" digit represents how many multiples of 100 (10^2) are in our number.
* "1,000"s would be multiples of (10^3), "10,000"s would be multiples of (10^4) and so on.

## Binary
**Binary** is also known as the **Base-2** Number System. In Binary integers, each digit represents a **Power of 2**. Lets take the binary number 1010 and break it down like into powers of two:

```(0 * 2^0) + (1 * 2^1) + (0  * 2^2) + (1 * 2^3)```

We don't have any multiples of 2^0 (1) or 2^2 (4), but we do have a single multiple of 2^1 (2) and 2^3(8), so if we convert our binary number to **Base-10** it would be 2 + 8 = **10**. 1010 is the Binary equivalent of the decimal, or Base-10, number **10**.

In Binary, each digit can only contain a 0 or a 1, so for each digit, there is either ZERO of that power of two, or ONE of that power of two. So our longform version of the binary number doesn't need all the multiplications. We can just write it as:

```(2^1) + (2^3)```

Let's look at a bigger example: 11111111 (that's eight 1's):

```2^0 + 2^1 + 2^2 + 2^3 + 2^4 + 2^5 + 2^6 + 2^7```

If we calculate all of those in decimal:

```1 + 2 + 4 + 8 + 16 + 32 + 64 + 128```

And our Binary number is **255**

## Other Bases
In programming, the Binary number system and the Powers of Two are important, but we also frequently use the **Hexadecimal** numbering system.

**Hexadecimal** is a **Base-16** numbering system, meaning that each digit of a Hexadecimal number can have a value from 0-15. For these number, we use the characters ```0, 1, 2,..., 8, 9, A, B, C, D, E, F```, Where ```A == 10```, ```B == 11```, ```C == 12```, ```D == 13```, ```E == 14```, and ```F == 15```.

Let's assume we have some arbitrary Hexadecimal numbers, like ```1A```, ```C3B```, or ```FFFF```

These can all be broken down by looking at the digits as **Powers of 16**:

* ```1A``` = ```(10 * 16^0) + (1 * 16^1)```
* ```C3B``` = ```(11 * 16^0) + (3 * 16^1) + (12 * 16^2)```
* ```FFFF``` = ```(15 * 16^0) + (15 * 16^1) + (15 * 16^2) + (15 * 16^3)```

Hexadecimal is a **Base-16** number system, so each digit represents a **Power of 16**. 

The same would hold true for any Base-n Number system. Each digit in any **Base-n** number system represents a **Power of n**

## [Exercise](./Exercise)
Do the following [exercise](./Exercise) for assignment credit.